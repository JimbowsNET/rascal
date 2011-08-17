/*******************************************************************************
 * Copyright (c) 2009-2011 CWI
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:

 *   * Paul Klint - Paul.Klint@cwi.nl - CWI
 *   * Arnold Lankamp - Arnold.Lankamp@cwi.nl
*******************************************************************************/
package org.rascalmpl.library.vis.figure.graph.layered;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;

import org.eclipse.imp.pdb.facts.IConstructor;
import org.eclipse.imp.pdb.facts.IList;
import org.eclipse.imp.pdb.facts.IString;
import org.eclipse.imp.pdb.facts.IValue;
import org.eclipse.imp.pdb.facts.IValueFactory;
import org.rascalmpl.interpreter.utils.RuntimeExceptionFactory;
import org.rascalmpl.library.vis.figure.Figure;
import org.rascalmpl.library.vis.figure.FigureFactory;
import org.rascalmpl.library.vis.graphics.GraphicsContext;
import org.rascalmpl.library.vis.properties.PropertyManager;
import org.rascalmpl.library.vis.swt.ICallbackEnv;
import org.rascalmpl.library.vis.swt.IFigureConstructionEnv;
import org.rascalmpl.library.vis.util.Coordinate;
import org.rascalmpl.library.vis.util.FigureMath;
import org.rascalmpl.library.vis.util.NameResolver;
import org.rascalmpl.values.ValueFactoryFactory;

/**

 * Layered Graph layout. Given a list of nodes and edges a graph layout is computed with given size.
 * 
 * We use a layered drawing method inspired by (but largely extended and tailored):
 * 
 * 		Battista, et. al Graph Drawing, Prentice Hall, 1999
 * 
 * and various other publications listed in the code below.
 * 
 * This graph layout can be selected with the property hint("layered")
 * 
 * @author paulk
 * 
 */

public class LayeredGraph extends Figure {
	protected ArrayList<LayeredGraphNode> nodes;
	protected ArrayList<LayeredGraphEdge> edges;
	protected HashMap<String, LayeredGraphNode> registeredNodeIds;
	protected HashMap<String, LinkedList<LayeredGraphNode>> registeredLayerIds;
	protected IFigureConstructionEnv fpa;
	
	double hgap;
	double vgap;
	double MAXWIDTH;
	private static final int INFINITY = 1000000;
	
	private static final boolean debug = true;
	private static final boolean printGraph = false;
	
	public LayeredGraph(IFigureConstructionEnv fpa, PropertyManager properties, IList nodes,
			IList edges) {
		super(properties);
		this.fpa = fpa;
		if(printGraph){
			String sep = "";
			System.err.printf("graph([\n");
			for(IValue v: nodes){
				System.err.printf("%s", sep + v);
				sep = ",\n\t";
			}
			System.err.printf("],\n[\n");
			sep = "";
			for(IValue v: edges){
				System.err.printf("%s", sep + v);
				sep = ",\n\t";
			}
			System.err.printf("]);");
		}
		
		
		// Create the nodes
		
		this.nodes = new ArrayList<LayeredGraphNode>();
		registeredNodeIds = new HashMap<String,LayeredGraphNode>();
		registeredLayerIds =  new HashMap<String, LinkedList<LayeredGraphNode>>();
		
		for(IValue v : nodes){
			IConstructor c = (IConstructor) v;
			Figure fig = FigureFactory.make(fpa, c, properties, null);
			String name = fig.getIdProperty();
			String layer = fig.getLayerProperty();

			if(name.length() == 0)
				throw RuntimeExceptionFactory.figureException("Id property should be defined", v, fpa.getRascalContext().getCurrentAST(), fpa.getRascalContext().getStackTrace());

			if(getRegisteredNodeId(name) != null)
				throw RuntimeExceptionFactory.figureException("Id property is doubly declared", v, fpa.getRascalContext().getCurrentAST(), fpa.getRascalContext().getStackTrace());
		
			LayeredGraphNode node = new LayeredGraphNode(name, fig);
			this.nodes.add(node);
			registerNodeId(name, node);
			
			if(layer.length() > 0){
				registerLayerId(layer, node);
			}
		}

		// Create the edges
		
		this.edges = new ArrayList<LayeredGraphEdge>();
		for (IValue v : edges) {
			IConstructor c = (IConstructor) v;
		    PropertyManager pm = c.arity() > 2 ? new PropertyManager(fpa, properties, (IList) c.get(2)) : properties;
			
			LayeredGraphEdge e = FigureFactory.makeLayeredGraphEdge(this, fpa, c, pm);
			boolean done = false;
			
			for(LayeredGraphEdge other : this.edges){
				if(other.getFrom() == e.getFrom() && other.getTo() == e.getTo()){
					// Identical edge, jut skip it;
					if(debug) System.err.println("Found identical edge");
					done = true;
					break;
				} else if(other.getFrom() == e.getTo() && other.getTo() == e.getFrom()){
					// Reverse edge, copy its arrows
					if(debug)System.err.println("Found reverse edge");
					Figure toArrow = e.toArrow;
					if(toArrow != null && other.fromArrow == null)
						other.fromArrow = toArrow;
					Figure fromArrow = e.fromArrow;
					if(fromArrow != null && other.toArrow == null)
						other.toArrow = fromArrow;
					other.getFrom().addIn(e.getFrom());
					other.getTo().addOut(e.getTo());
					done = true;
					break;
				}
			}
			
			if(!done){
				this.edges.add(e);
				e.getFrom().addOut(e.getTo());
				e.getTo().addIn(e.getFrom());
			}
		}
		
		if(debug){
			for(LayeredGraphEdge e : this.edges){
				System.err.println(" xx edge: " + e.getFrom().name + " -> " + e.getTo().name + " toArrow=" + e.toArrow + " fromArrow=" + e.fromArrow);
			}
		}
	}
	
	/**
	 * Associate name with node nd
	 * @param name
	 * @param nd
	 */
	public void registerNodeId(String name, LayeredGraphNode nd){
		registeredNodeIds.put(name, nd);
	}

	/**
	 * Get the node associated with name
	 * @param name
	 * @return
	 */
	public LayeredGraphNode getRegisteredNodeId(String name) {
		return registeredNodeIds.get(name);
	}
	
	public void registerLayerId(String name, LayeredGraphNode nd){
		LinkedList<LayeredGraphNode> L = registeredLayerIds.get(name);
		if(L == null){
			L = new LinkedList<LayeredGraphNode> ();
		}
		L.add(nd);
		registeredLayerIds.put(name, L);
	}
	
	public LinkedList<LayeredGraphNode> getRegisteredLayer(String name){
		System.err.println("getRegisteredLayer: " + name);
		return registeredLayerIds.get(name);
	}
	
	/**
	 * Print msg followed by the layers in readable format
	 * @param msg
	 * @param layers
	 */
	private void print(String msg, LinkedList<LinkedList<LayeredGraphNode>> layers){
		System.err.println("---- " + msg);
		for(int i = 0; i < layers.size(); i++){
			LinkedList<LayeredGraphNode> layer = layers.get(i);
			if(i > 0) System.err.println("");
			System.err.print("Layer " + i + ": ");
			for(int j = 0; j < layer.size(); j++){
				LayeredGraphNode g = layer.get(j);
				System.err.print("(" + j + ", " + g.name + ") ");
			}
		}
		System.err.println("\n----");
	}
	
	private void printList(String msg, LinkedList<LayeredGraphNode> nodes){
		System.err.printf("%s: [ ", msg);
		for(LayeredGraphNode g : nodes) System.err.printf("%s ", g.name);
		System.err.printf("]\n");
	}
	
	
	private void printGraph(String txt){
		System.err.println(txt);
		for(LayeredGraphNode g : nodes){
			g.print();
		}
	}
	
	@Override
	public void bbox() {
		minSize.setWidth(getWidthProperty());
		MAXWIDTH = minSize.getWidth();
		//MAXWIDTH = width = 1000;
		minSize.setHeight(getHeightProperty());
		hgap = getHGapProperty();
		vgap = getVGapProperty();
		
		double maxNodeWidth = 0;
		
		for(LayeredGraphNode g : nodes){
			g.bbox();
			System.err.printf("%s: %f, %f\n", g.name, g.width(), g.height());
			if(g.width() > maxNodeWidth){
				maxNodeWidth = g.width();
			}
		}
		
		for(LayeredGraphEdge e : edges){
			e.bbox();
		}

		//switchWidthAndHeight();
		computeGraphLayout();
		alignToSmallest();
		translateToOrigin();
		//switchWidthAndHeight();
		rotateToDirection();
		setNonResizable();
		super.bbox();
	}
	
	/**
	 * Translate all nodes to position top/left of graph at origin (0.0)
	 * and compute actual dimensions
	 */
	private void translateToOrigin(){
		double minx = Double.MAX_VALUE;
		double maxx = Double.MIN_VALUE;
		double miny = Double.MAX_VALUE;
		double maxy = Double.MIN_VALUE;

		for (LayeredGraphNode n : nodes) {
			double w2 = n.width() / 2;
			double h2 = n.height() / 2;
			if(n.x < 0)
				System.err.println(n.name + " has negative x: " + n.x);
			if (n.x - w2 < minx)
				minx = n.x - w2;

			if (n.x + w2 > maxx)
				maxx = n.x + w2;

			if (n.y - h2 < miny)
				miny = n.y - h2;

			if (n.y + h2 > maxy)
				maxy = n.y + h2;
		}
		
		for (LayeredGraphEdge e : edges) {
			if(e.label != null){
			double w2 = e.label.minSize.getWidth() / 2;
			double h2 = e.label.minSize.getHeight() / 2;
			
			if (e.labelX - w2 < minx)
				minx = e.labelX - w2;

			if (e.labelX + w2 > maxx)
				maxx = e.labelX + w2;

			if (e.labelY - h2 < miny)
				miny = e.labelY - h2;

			if (e.labelY + h2 > maxy)
				maxy = e.labelY + h2;
			}
		}
		
		System.err.printf("minx=%f, maxc=%f; miny=%f, maxy=%f\n", minx, maxx, miny, maxy);
		for (LayeredGraphNode n : nodes) {
			System.err.printf("%s: %f,%f -> %f,%f\n", n.name, n.x, n.y, n.x - minx, n.y - miny);
			n.x = n.x - minx;
			n.y = n.y - miny;
		}
		
		for(LayeredGraphEdge e : edges){
			if(e.label != null){
				e.labelX -= minx;
				e.labelY -= miny;
			}
		}
		minSize.setWidth(maxx - minx);
		minSize.setHeight(maxy - miny);
	}
	
	private void switchWidthAndHeight(){
		String dir = getDirectionProperty();
		if(dir.length() == 0 || dir.equals("TB") || dir.equals("BT"))
			return;
		
		for (LayeredGraphNode n : nodes){
			n.exchangeWidthAndHeight();
		}
	}
	
	/**
	 * align the four layouts to the narrowest one:
	 * - left top/bottom is alligned to minimum of narrowest
	 * - right top/bottom is aligned to maximum of narrowest
	 */
	private void alignToSmallest(){
		double minX[] = {INFINITY, INFINITY, INFINITY, INFINITY};
		double maxX[] = {-1, -1, -1, -1};
		
		for(Direction dir : Direction.dirs){
			for(LayeredGraphNode n : nodes){
				int k = Direction.ord(dir);
				if(n.x < minX[k])
					minX[k] = n.x;
				if(n.x > maxX[k])
					maxX[k] = n.x;
			}
		}
		
		double narrowest = INFINITY;
		int dirNarrowest = -1;
		
		for(Direction dir : Direction.dirs){
			int k = Direction.ord(dir);
			double w = maxX[k] - minX[k];
			if(w < narrowest){
				narrowest = w;
				dirNarrowest = k;
			}
		}
		
		double shifts[] = {0, 0, 0, 0};
		for(Direction dir : Direction.dirs){
			int k = Direction.ord(dir);
			if(Direction.isLeftDirection(dir)){
				shifts[k] = minX[k] - minX[dirNarrowest];
			} else
				shifts[k] = maxX[k] - maxX[dirNarrowest];
		}
		
		for(LayeredGraphNode n : nodes){
			n.shiftX(shifts);
		}
		
	}
	
	private void rotateToDirection(){
		String dir = getDirectionProperty();
		if(dir.length() == 0 || dir.equals("TB"))
			return;
		
		if(dir.equals("BT")){
			for (LayeredGraphNode n : nodes){
				System.err.println("rotate: " + n.name + ": " + n.y + " -> " + (minSize.getHeight()- n.y));
				n.y = minSize.getHeight() - n.y;
			}
			return;
		}
		double tmp;
		if(dir.equals("LR")){
			for (LayeredGraphNode n : nodes){
				tmp = n.x; n.x = n.y; n.y = minSize.getWidth() - tmp;
			}
			
		} else if(dir.equals("RL")){
			for (LayeredGraphNode n : nodes){
				tmp = n.x; n.x = minSize.getWidth() - n.y; n.y = tmp;
			}
		}
		
		tmp = minSize.getWidth();
		minSize.setWidth(minSize.getHeight());
		minSize.setHeight(tmp);
	}

	@Override
	public
	void draw(GraphicsContext gc) {

		applyProperties(gc);		
		gc.rect(getLeft(), getTop(), minSize.getWidth(), minSize.getHeight());
		for (LayeredGraphEdge e : edges)
			e.draw(gc);
		
		for (LayeredGraphNode n : nodes) {
			n.draw(getLeft(),  getTop() ,gc);
		}	
	}
	
	private int findSink(LinkedList<LayeredGraphNode> nlist){
		int n = 0;
		for(LayeredGraphNode g : nlist){
			if(g.isSink())
				return n;
			n++;
		}
		return -1;
	}
	
	private int findSource(LinkedList<LayeredGraphNode> nlist){
		int n = 0;
		for(LayeredGraphNode g : nlist){
			if(g.isSource())
				return n;
			n++;
		}
		return -1;
	}
	
	private int findLargestOutIn(LinkedList<LayeredGraphNode> nlist){
		int n = -1;
		int max = -100000;
		for(int i = 0; i < nlist.size(); i++){
			LayeredGraphNode g = nlist.get(i);
			int d = g.getOutInDiff();
			if(d > max){
				n = i;
				max = d;
			}
		}
		return n;
	}
	
	/**
	 * Compute graph layout in the following stages:
	 * - assignLayers (this includes cycle removal)
	 * - insertVirtualNodes for edges that span more than one layer
	 * - reduceCrossings by reordering nodes within each layer
	 * - placeHorizontal by horizontally positioning nodes within each layer
	 */
	private void computeGraphLayout(){
		@SuppressWarnings("unused")  // TODO: Use W as width
		int W = FigureMath.round(1.5f * FigureMath.sqrt(nodes.size()) + 1); 
		
		if(debug)
			printGraph("Initial graph");
		
		LinkedList<LinkedList<LayeredGraphNode>> layers = assignLayers(MAXWIDTH); 
		if(debug)
			print("assignLayers", layers);
		
		layers = insertVirtualNodes(layers);
		if(debug)
			print("insertVirtualNodes", layers);
		
		layers = reduceCrossings(layers);
		if(debug)
			print("reduceCrossings", layers);
		
		layers = moveInnerCrossingsDown(layers);
		if(debug)
			print("moveInnerCrossingsDown", layers);
		
		placeHorizontal(layers);
		
		placeLabels(layers);
		
		if(debug)
			printGraph("Final graph");
	}
	
	/**
	 * Order the nodes so that they are topologically ordered and remove cycles.
	 * Uses Greedy-Cycle-Removal (Algorithm 9.4 in Battista et al.)
	 * 
	 */
	public void removeCycles(){
		LinkedList<LayeredGraphNode> SL = new LinkedList<LayeredGraphNode>();
		LinkedList<LayeredGraphNode> SR = new LinkedList<LayeredGraphNode>();
		
		LinkedList<LayeredGraphNode> shadowNodes = new LinkedList<LayeredGraphNode>();

		for(LayeredGraphNode g : nodes){
			g.addShadowConnections();
			shadowNodes.add(g);
		}
		
		while(shadowNodes.size() > 0){
			do {
				int n = findSink(shadowNodes);
				if(n >= 0){
					LayeredGraphNode g = shadowNodes.remove(n);
					g.disconnect();
					SR.addFirst(g);
					if(debug)System.err.printf("add sink %s\n", g.name);
				} else
						break;
			} while(true);
			do {
				int n = findSource(shadowNodes);
				if(n >= 0){
					LayeredGraphNode g = shadowNodes.remove(n);
					g.disconnect();
					SL.addLast(g);
					if(debug)System.err.printf("add source %s\n", g.name);
				} else
						break;
			} while(true);
			
			if(debug)System.err.println("Sinks and sources added");
			if(shadowNodes.size() > 0){
				int max = findLargestOutIn(shadowNodes);
				if(max >= 0){
					LayeredGraphNode g = shadowNodes.removeFirst();
					SL.addLast(g);
					g.disconnect();
					if(debug)System.err.printf("add node %s\n", g.name);
				}
			}
		}
		
		// Set the label in the original nodes.
		
		int n = 0;
		// First nodes in SL ...
		for(LayeredGraphNode g : SL)
			g.label = n++;
	
		// ... and then the nodes in SR
		for(LayeredGraphNode g : SR)
			g.label = n++;
		
		// Reverse all edges that go upwards and obtain an a-cyclical graph
		
		for(LayeredGraphEdge e : edges){
			if(e.getFrom().label >  e.getTo().label){
				if(debug)System.err.println("Inverting " + e.getFrom().name + " => " + e.getTo().name);
				e.reverse();
			}
		}
		
		for(LayeredGraphNode g : nodes){
			g.delShadowConnections();
		}
	}
	
	/**
	 * Assign nodes to layers using Coffman-Graham-Layering (Alg. 9.1 in Battista et al)
	 * @param W	TODO unused
	 * @return
	 */
	private LinkedList<LinkedList<LayeredGraphNode>> assignLayers(double W){
		if(nodes.size() == 0)
			return new LinkedList<LinkedList<LayeredGraphNode>>();
		
		removeCycles();
		
		if(debug)
			for(LayeredGraphNode g : nodes){
				System.err.printf("Node %s, label=%d, isSource=%b, isSink=%b\n", g.name, g.label, g.isSource(), g.isSink());
			}
		
		// Label the nodes (again!) as needed using a lexicographic ordering
		// defined on LayeredGraphNodes (using compare).
		
		LinkedList<LayeredGraphNode> worklist = new LinkedList<LayeredGraphNode>();
		LinkedList<LayeredGraphNode> labeled = new LinkedList<LayeredGraphNode>();
	
		for(LayeredGraphNode g : nodes){
			worklist.add(g);
			g.label = -1;
		}
		
		// Choose unlabeled node such that the labels of its inputs are minimized
		
		int label = 0;
		while(!worklist.isEmpty()){
			LayeredGraphNode current = null;
			for(LayeredGraphNode g : worklist){
				//System.err.println("For " + g.name + " AllInLablled = " + g.AllInLabelled());
				if(g.AllInLabelled()){
					if(debug)System.err.println("Consider " + g.name);

					if(current != null)
						if(debug) System.err.println("compare(" + current.name + ", " + g.name + ") == " + current.compareTo(g));
					if(current == null || current.compareTo(g) == 1)
						current = g;
				}
			}
			if(current == null)
				current = worklist.getFirst();
			current.label = label++;
			if(debug)System.err.println("*** Label " + current.name + " with " + current.label);
			worklist.remove(current);
			labeled.add(current);
		}
		
		// Place the labeled nodes in layers
		
		LinkedList<LinkedList<LayeredGraphNode>> layers = new LinkedList<LinkedList<LayeredGraphNode>>();
		
		LinkedList<LayeredGraphNode> currentLayer = new LinkedList<LayeredGraphNode>();
		
		// We create the layers from bottom to top, i.e. sinks are placed in layer 0.
		
		LinkedList<LayeredGraphNode> forcedTopLayer = getRegisteredLayer("TOP");
		LinkedList<LayeredGraphNode> forcedBottomLayer = getRegisteredLayer("BOTTOM");
		
		if(forcedBottomLayer != null){
			for(LayeredGraphNode g : forcedBottomLayer){
				System.err.println("BOTTOM node " + g.name);
				labeled.remove(g);
				currentLayer.addLast(g);
				g.layer = layers.size();
			}
			layers.addFirst(currentLayer);
			currentLayer = new LinkedList<LayeredGraphNode>();
		}
		
		if(forcedTopLayer != null){
			for(LayeredGraphNode g : forcedTopLayer){
				System.err.println("TOP node " + g.name);
				labeled.remove(g);
			}
		}
		
		while(!labeled.isEmpty()){
			
			// Choose a node with the largest label with all its outputs already assigned to layers
			
			LayeredGraphNode current = null;
			for(LayeredGraphNode g : labeled){
				if(g.AllOutAssignedToLayers()){
					if(current == null || g.label > current.label)
						current = g;
				}
			}
			
			if(current == null){
				if(debug)System.err.println("current is null");
				current = labeled.getLast();
				if(debug)System.err.println("pick current: " + current.name);
			}
			
			if(debug)System.err.println("current is " + current.name);
			
			labeled.remove(current);
			
			if (currentLayer.size() < W && (current.AllOutAssignedToLayers(layers.size()) || currentLayer.size() == 0)){
				currentLayer.addLast(current);
				current.layer = layers.size();
			} else {
				layers.addFirst(currentLayer);
				currentLayer = new LinkedList<LayeredGraphNode>();
				currentLayer.addLast(current);
				current.layer = layers.size();
			}
			
			if(debug)System.err.println("*** Assign " + current.name + " to layer " + current.layer);
			
			LinkedList<LayeredGraphNode> forcedSameLayer = getRegisteredLayer(current.getLayer());
			
			if(forcedSameLayer != null && forcedSameLayer.size() > 0){
				for(LayeredGraphNode g : forcedSameLayer){
					if(g != current){
						currentLayer.addLast(g);
						g.layer = layers.size();
						labeled.remove(g);
						System.err.println("*** Assign " + g.name + " to same layer (" + g.layer + ")");
					}
				}
				layers.addFirst(currentLayer);
				currentLayer = new LinkedList<LayeredGraphNode>();
			}
		}
		
		if(forcedTopLayer != null && forcedTopLayer.size() > 0){
			layers.addFirst(currentLayer);
			currentLayer = new LinkedList<LayeredGraphNode>();
			for(LayeredGraphNode g : forcedTopLayer){
				currentLayer.addLast(g);
				g.layer = layers.size();
			}
		}
		if(currentLayer.size() > 0)
			layers.addFirst(currentLayer);
		
		// Since we assume in the other methods that the layers are numbered from top (0) to bottom
		// We reverse and correct the layer field in each node before returning.
		
		for(int h = 0; h < layers.size(); h++){
			LinkedList<LayeredGraphNode> layer = layers.get(h);
			for(LayeredGraphNode g :layer){
				g.layer = h;
			}
		}
		
		return moveSourcesDown(moveSinksUp(layers));
	}
	
	private LinkedList<LinkedList<LayeredGraphNode>> moveSinksUp(LinkedList<LinkedList<LayeredGraphNode>> layers){
		for(int l = 0; l < layers.size(); l++){
			LinkedList<LayeredGraphNode> layer = layers.get(l);
			LinkedList<LayeredGraphNode> moved = new LinkedList<LayeredGraphNode>();
			for(int i = 0; i < layer.size(); i++){
				LayeredGraphNode g = layer.get(i);
				LayeredGraphNode p = g.lowestIn();
				if(p != null && g.layer - p.layer > 1 && g.getLayer().length() == 0){
					int newLayer = p.layer + 1;
					layers.get(newLayer).add(g);
					g.layer = newLayer;
					moved.add(g);
				}
			}
			for(LayeredGraphNode g : moved)
				layer.remove(g);
		}
		return layers;
	}
	
	private LinkedList<LinkedList<LayeredGraphNode>> moveSourcesDown(LinkedList<LinkedList<LayeredGraphNode>> layers){

		for(int l = 0; l < layers.size(); l++){
			LinkedList<LayeredGraphNode> layer = layers.get(l);
			LinkedList<LayeredGraphNode> moved = new LinkedList<LayeredGraphNode>();
			for(int i = 0; i < layer.size(); i++){
				LayeredGraphNode g = layer.get(i);
				LayeredGraphNode child = g.highestOut();
				if(child != null && child.layer - g.layer > 1 && g.getLayer().length() == 0){
					int newLayer = child.layer - 1;
					layers.get(newLayer).add(g);
					g.layer = newLayer;
					moved.add(g);
				}
			}
			for(LayeredGraphNode g : moved)
				layer.remove(g);
		}
		return layers;
	}
	
	/**
	 * Insert a virtual node between nodes from and to. The nodes may be above or below each other.
	 * @param layers of the graph
	 * @param from	start node
	 * @param to	end node
	 */
	private void insertVirtualNode(LinkedList<LinkedList<LayeredGraphNode>> layers, LayeredGraphNode orgFrom, LayeredGraphNode to){
		
		LayeredGraphNode from = orgFrom;
		boolean downwards = from.isAbove(to);
		int delta = downwards ? 1 : -1;
		int halfWay = from.layer + (downwards ? (to.layer - from.layer)/2 : (from.layer - to.layer)/2);
		Figure orgEdgeLabel =  null;
		
		while(Math.abs(to.layer - from.layer) > 1 && !to.hasVirtualOutTo(from)){
			if(debug)System.err.println("insertVirtualNode: " + from.name + "-> " + to.name);
			// Create virtual node
			
			String fromName = from.name;
			int fni = from.name.indexOf("_");
			if(fni > 0)
				fromName = fromName.substring(0, fni);
			
			String vname =  fromName + "_" + to.name + "[" + (from.layer + delta) + "]";
			if(debug)System.err.println("Creating virtual node " + vname + " between " + fromName + " and " + to.name);
			LayeredGraphNode virtual = new LayeredGraphNode(vname, null);
			IValueFactory vf = ValueFactoryFactory.getValueFactory();
			IString vfVname = vf.string(vname);
			nodes.add(virtual);
			
			registerNodeId(vname, virtual);
			
			LinkedList<LayeredGraphNode> vlayer = layers.get(from.layer+delta);
			virtual.layer = from.layer + delta;
			virtual.pos = vlayer.size();

			virtual.in.add(from);
			virtual.out.add(to);
			from.out.set(from.out.indexOf(to), virtual);
			to.in.set(to.in.indexOf(from), virtual);

			vlayer.add(virtual);

			LayeredGraphEdge old = null;
			for(LayeredGraphEdge e : edges){
				if(debug)System.err.println("Consider edge " + e.getFrom().name + " -> " + e.getTo().name);
				if(e.getFrom() == from && e.getTo() == to){
					old = e;
					if(from == orgFrom){
						orgEdgeLabel = e.getLabel();
					}

					if(debug)System.err.println("Removing old edge " + from.name + " -> " + to.name);
					break;
				}
			}
			//if(old == null)
			//	throw RuntimeExceptionFactory.figureException("Internal error in insertVirtualNode", vfVname, fpa.getRascalContext().getCurrentAST(), fpa.getRascalContext().getStackTrace());

			IString vfGname = vf.string(from.name);
			IString vfOname = vf.string(to.name);
			if(old != null){
				if(old.isReversed()){
					LayeredGraphEdge e1 = new LayeredGraphEdge(this, fpa, properties, vfGname, vfVname, old.fromArrow, old.toArrow);
					LayeredGraphEdge e2 = new LayeredGraphEdge(this, fpa, properties, vfVname, vfOname, old.fromArrow, old.toArrow);
					if(old.getFrom().layer == halfWay)
						e1.label = orgEdgeLabel;
						
					edges.add(e1);
					edges.add(e2);
				} else {
					LayeredGraphEdge e1 = new LayeredGraphEdge(this, fpa, properties, vfGname, vfVname, old.toArrow, old.fromArrow);
					LayeredGraphEdge e2 = new LayeredGraphEdge(this, fpa, properties, vfVname, vfOname, old.toArrow, old.fromArrow);
					if(old.getFrom().layer == halfWay)
						e1.label = orgEdgeLabel;
					
					edges.add(e1);
					edges.add(e2);
				}
				edges.remove(old);
			}
			
			from = virtual;
		}
	}

	/**
	 * Insert virtual nodes in all layers
	 * @param layers
	 * @return layered graph extended with virtual nodes
	 * Note: we assume here that insertVirtualNode adds virtual nodes at the END of nodes.
	 */
	private LinkedList<LinkedList<LayeredGraphNode>> insertVirtualNodes(LinkedList<LinkedList<LayeredGraphNode>> layers){
		
		int n = nodes.size();
		for(int i = 0; i < n; i++){
			LayeredGraphNode g = nodes.get(i);
			for(LayeredGraphNode no : g.out){
				insertVirtualNode(layers, g, no);
			}
			
			for(LayeredGraphNode ni : g.in){
					insertVirtualNode(layers, ni, g);
			}
		}
		return layers;
	}
	
	private LinkedList<LinkedList<LayeredGraphNode>> estimateHorizontalPositions(LinkedList<LinkedList<LayeredGraphNode>> layers){
	// Initial estimate of x positions (centered placement)
		
		for(int i = 0; i < layers.size(); i++){
			LinkedList<LayeredGraphNode> layer = layers.get(i);
			
			for(int j = 0; j < layer.size(); j++){
				LayeredGraphNode g = layer.get(j);
				g.x = (j+1) * 10;
			}
//			double w = 0;
//			for(int j = 0; j < layer.size(); j++){
//				LayeredGraphNode g = layer.get(j);
//				w += g.width();
//			}
//			w += (layer.size() - 1) * hgap; // account for gaps between nodes
//			double x = (MAXWIDTH - w)/2;
//			for(int j = 0; j < layer.size(); j++){
//				double wg =  layer.get(j).width();
//				layer.get(j).x = x + wg/2;
//				x += wg + hgap;
//			}
		}
		return layers;
	}
	
	private LinkedList<LinkedList<LayeredGraphNode>> placeAtBaryCenters(LinkedList<LinkedList<LayeredGraphNode>> layers){
		layers = estimateHorizontalPositions(layers);
		
		for(int i = 0; i < 5; i++)
			layers = placeAtBaryCenters1(layers);
		
		// Set all x positions back to uninitialized
		
		for(LayeredGraphNode g : nodes)
			g.x = -1;
		
		return layers;
	}
	
	/**
	 * Place each node in each layer at its barycenter
	 * @param layers
	 * @return modified layers
	 */
	private LinkedList<LinkedList<LayeredGraphNode>> placeAtBaryCenters1(LinkedList<LinkedList<LayeredGraphNode>> layers){
		LinkedList<LayeredGraphNode> empty = new LinkedList<LayeredGraphNode>();
		
		// Now place each node at the barycenter of its neighbours
		
		for(int i = 0; i < layers.size(); i++){
			if(debug)System.err.println("Layer " + i);
			LinkedList<LayeredGraphNode> P = (i == 0) ? empty : layers.get(i-1);
			LinkedList<LayeredGraphNode> L = layers.get(i);
			LinkedList<LayeredGraphNode> N = (i == layers.size()-1) ? empty : layers.get(i+1);
			LinkedList<LayeredGraphNode> LR = new LinkedList<LayeredGraphNode>();
			
			for(int j = 0; j < L.size(); j++){
				LayeredGraphNode g = L.get(j);
				if(debug)System.err.println("Node " + g.name);
			
				double baryCenter = g.baryCenter(P, N);
				double median = g.median(P);
				
				if(debug){System.err.println("median = " + median);
					System.err.println("baryCenter = " + baryCenter);
					System.err.println("x = " + g.x);
				}
				boolean added = false;
				
				for(int k = 0; k < LR.size(); k++){
					LayeredGraphNode lrG = LR.get(k);
					if(baryCenter > lrG.baryCenter(P,N)){
						g.x = baryCenter;
						LR.add(k,g);
						added = true;
						break;
					}
					if(k > 0 && baryCenter == lrG.x){
						if(debug)System.err.println("Tie for " + g.name + " and " + lrG.name);
						double prevX = LR.get(k-1).x;
						g.x = prevX + (baryCenter - prevX)/2 -k;
						LR.add(k-1,g);
						added = true;
						break;
					}
				}
				if(!added)
					LR.addLast(g);
			}
			
			if(debug) printList("LR = ", LR);
		
			layers.set(i, LR);
		}
		return layers;
	}

	
	/**
	 * Compute the number of crossings for two adjacent nodes u and v with nodes in the "previous" layer
	 * Going down:  L1
	 *              L2 (u, v)
	 *              use the input of u and v
	 * Going up:	L2 (u,v)
	 *              L1
	 *              use the outputs of u and v
	 * @param down	when true go down, otherwise go up.
	 * @param L1	top layer (when down = true)
	 * @param L2	bottom layer (when down = false)
	 * @param u		left node
	 * @param v		right node
	 * @return the number of crossings
	 */
	private int cn(boolean down, LinkedList<LayeredGraphNode> L1, LinkedList<LayeredGraphNode> L2, LayeredGraphNode u, LayeredGraphNode v){
		
		int n = 0;
		if(debug)System.err.printf("cn(%s,%s,%b)\n", u.name, v.name, down);
		
		assert L2.contains(u) && L2.contains(v);
		
/*	//	LinkedList<LayeredGraphNode> L = down ? L2 : L1;
		LinkedList<LayeredGraphNode> L = down ? L1 : L2;
		for(LayeredGraphNode iu : down ? u.in : u.out){
			for(LayeredGraphNode iv : down ? v.in : v.out){
				if(L.indexOf(iu) > L.indexOf(iv)){
					System.err.printf("Crossing for %s (%d) and %s (%d)\n", 
							           iu.name, L.indexOf(iu), iv.name, L.indexOf(iv));
					n++;
				}
			}
		}
*/		
		if(down){ // going down: top layer L1, bottom layer L2, u,v in L2, inputs in L1
			if(debug)printList("Neighbours " + u.name, u.getAllConnectedNeighbours(L1));
			for(LayeredGraphNode iu : u.getAllConnectedNeighbours(L1)){
				if(debug)printList("Neighbours " + v.name, v.getAllConnectedNeighbours(L1));
				for(LayeredGraphNode iv : v.getAllConnectedNeighbours(L1)){
					if(debug)System.err.printf("iu=%s, iv=%s\n", iu.name, iv.name);
					if(L1.indexOf(iu) > L1.indexOf(iv)){
						if(debug)System.err.printf("Crossing for %s (%d) and %s (%d)\n", iu.name, L1.indexOf(iu), iv.name, L1.indexOf(iv));
						n++;
					}
				}
			}
		} else { // going up: top Layer L2, bottom layer L1, u, v in L2, outputs in L1
			if(debug)printList("Neighbours " + u.name, u.getAllConnectedNeighbours(L1));
			for(LayeredGraphNode ou : u.getAllConnectedNeighbours(L1)){
				if(debug)printList("Neighbours " + v.name, v.getAllConnectedNeighbours(L1));
				for(LayeredGraphNode ov : v.getAllConnectedNeighbours(L1)){
					if(debug)System.err.printf("ou=%s (index=%d), ov=%s (index=%d)\n", ou.name,  L1.indexOf(ou), ov.name, L1.indexOf(ov));
					if(L1.indexOf(ou) > L1.indexOf(ov)){
						if(debug)System.err.printf("Crossing for %s (%d) and %s (%d)\n", ou.name, L1.indexOf(ou), ov.name, L1.indexOf(ov));
						n++;
					}
				}
			}
		}
		if(debug)System.err.println("cn(" +  u.name + ", " + v.name + (down ? ", down" : ", up") + ") -> " + n);
		return n;
	}
	
		
	private int exchangeAdjacentNodes(LinkedList<LayeredGraphNode> L1, LinkedList<LayeredGraphNode> L2, boolean down){
		if(debug){
			System.err.printf("exchangeAdjacentNodes: down = %b, L1= [ ", down);
			for(LayeredGraphNode g : L1) System.err.printf("%s ", g.name);
			System.err.printf("] L2 = [ ");
			for(LayeredGraphNode g : L2) System.err.printf("%s ", g.name);
			System.err.printf("]\n");
		}
		int prevCrossings = INFINITY;
		int curCrossings = prevCrossings - 1;
	
		while(curCrossings < prevCrossings){
			prevCrossings = curCrossings;
			curCrossings = 0;

			for(int j = 0; j < L2.size() - 1; j++){
				LayeredGraphNode u = L2.get(j);
				LayeredGraphNode v = L2.get(j+1);
				if(debug)System.err.println("for node u=" + u.name + " (j = " + j + ") and node v=" + v.name);
				int cnbefore = cn(down, L1, L2, u, v);
				L2.set(j, v); v.pos = j;
				L2.set(j+1, u); u.pos = j+1;
				int cnafter = cn(down, L1, L2, v, u);
				if(debug)System.err.printf("j=%d, u=%s, v=%s, cnb=%d, cna=%d\n", j, u.name, v.name, cnbefore, cnafter);
				if(cnbefore > cnafter){
					curCrossings += cnafter;
					if(debug)System.err.println("*** Exchange " + u.name + " and " + v.name);
				//} else if(cnbefore == cnafter){
				//	curCrossings += cnbefore;
				//	System.err.println("*** Exchange (equal )" + u.name + " and " + v.name);
				} else {
					curCrossings += cnbefore;
					L2.set(j, u); u.pos = j;
					L2.set(j+1, v); v.pos = j+1;
				}
			}
		}
		if(debug)System.err.printf("exchangeAdjacentNodes => %d\n", prevCrossings);
		return prevCrossings;
	}
	
	/**
	 * Reduce the number of crossings by making top/down and bottom/up sweeps across the layers and exchanging
	 * nodes in a layer when appropriate. This is potentially extremely inefficient.
	 * @param layers of the graph
	 * @return the modified layers
	 */
	private LinkedList<LinkedList<LayeredGraphNode>> reduceCrossings(LinkedList<LinkedList<LayeredGraphNode>> layers){
		
		layers = placeAtBaryCenters(layers);
		
		if(debug)print("reduceCrossings: placeAtBaryCenters done", layers);
		
        int prevCrossings = INFINITY;
        int curCrossings =  prevCrossings - 1;
        int grace = 10; // grace more iterations when nothing seems to change
       
		for(int iter = 0; (curCrossings < prevCrossings) || grace-- > 0; iter += 2){
			prevCrossings = curCrossings;
			curCrossings = 0;
			for(int k = 0; k < 2; k++){
				boolean down = k == 0;
				if(debug){
					System.err.println("=== iter = " + iter + ", " + (down ? "down" : "up") + " crossings = " + prevCrossings  + " ===");
					print("At start of iteration:", layers);
				}

				for(int i = down ? 0 : layers.size()-1; down ? (i <= layers.size()-2) : (i > 0); i += (down ? 1 : -1)){
					if(debug)System.err.println("--- for layer i = " + i);
					curCrossings += exchangeAdjacentNodes(layers.get(i), layers.get(down ? i+1 : i-1), down);
				}
			}
		}
		if(debug)System.err.println("crossings = " + prevCrossings);
		
		// Assign layer position to each node;
		
		for(LinkedList<LayeredGraphNode> layer : layers){
			for(int i = 0; i < layer.size(); i++)
				layer.get(i).pos = i;
		}
		return layers;
	}
	
	private LinkedList<LinkedList<LayeredGraphNode>> moveInnerCrossingsDown(LinkedList<LinkedList<LayeredGraphNode>> layers){
		for(int i = 1; i < layers.size() - 1; i++){
			LinkedList<LayeredGraphNode> lowerLayer = layers.get(i);
			
			for(int j = 0; j < lowerLayer.size() - 2; j++){
				LayeredGraphNode w1 = lowerLayer.get(j);
				LayeredGraphNode w2 = lowerLayer.get(j+1);
				if(w1.isVirtual() && w2.isVirtual()){
					LayeredGraphNode v1 = w1.in.get(0);
					LayeredGraphNode v2 = w2.in.get(0);
					System.err.println(" Exchange option: " + w1.name + " and " + w2.name);
					if(v1.pos > v2.pos){
						System.err.println("Exchange " + w1.name + " and " + w2.name);
						int w1Pos = w1.pos;
						int w2Pos = w2.pos;
						lowerLayer.set(w1Pos, w2); w2.pos = w1Pos;
						lowerLayer.set(w2Pos, w1); w1.pos = w2Pos;
					}
				}
			}
		}
		return layers;
	}
	
	/*
	 * Horizontal placement is based on
	 * Ulrik Brandes & Boris Kopf, Fast and Simple Horizontal Coordinate Assignment,
	 * Graph Drawing 2001, LNCS 2265, pp 31-44, 2002.
	 */
	
	private HashMap<LayeredGraphNode,LinkedList<LayeredGraphNode>> marked;
	
	private void mark(LayeredGraphNode from, LayeredGraphNode to){
		LinkedList<LayeredGraphNode> associates = marked.get(from);
		if(associates == null)
			associates = new LinkedList<LayeredGraphNode>();
		associates.add(to);
		marked.put(from, associates);
	}
	
	private boolean isMarked(LayeredGraphNode from, LayeredGraphNode to){
		LinkedList<LayeredGraphNode> associates = marked.get(from);
		return associates == null ? false : associates.contains(to);
	}
	
	/**
	 * Preprocess all nodes and mark "type 1" conflicts, i.e. crossings of an
	 * inner segment (= segment between two virtual nodes) and a non-inner segment. 
	 * Resolve in favor of inner segment.
	 * 
	 * @param layers
	 */
	private void preprocess(LinkedList<LinkedList<LayeredGraphNode>> layers){
		
		marked = new HashMap <LayeredGraphNode,LinkedList<LayeredGraphNode>>();
		 
		int h = layers.size()-1;
		for(int i = 2; i <= h-2; i++){
			int k0 = 0;
			int l = 0;
			LinkedList<LayeredGraphNode> Li = layers.get(i);
			int lastLi = Li.size() - 1;
			LinkedList<LayeredGraphNode> Lip1 = layers.get(i+1);
			int lastLip1 = Lip1.size()-1;
			for(int l1 = 0; l1 <= lastLip1; l1++){
				LayeredGraphNode vl1 = Lip1.get(l1);
				boolean incidence = vl1.incidentToInnerSegment(Li);
				if(incidence)
					System.err.println("incidence for: " + vl1.name);
				if(l1 == lastLip1 || incidence){
					int k1 = lastLi;
					if(incidence){
						k1 = vl1.rightMostConnectedNeighbour();
					}
					while (l <= l1){
						LayeredGraphNode vl = Lip1.get(l);
						System.err.println("vl = " + vl.name);
						for(LayeredGraphNode vki : vl.getAllConnectedNeighbours(Li)){
							System.err.println("vki = " + vki.name);
							int k = vki.pos;
							System.err.printf("k=%d, k0=%d, k1=%d\n", k, k0, k1);
							if(!(vl.isVirtual() && vki.isVirtual()) && (k < k0 || k > k1)){
								if(debug)System.err.println("mark " + vki.name + " -> " + vl.name);
								vki.marked = true;
								mark(vki, vl);
							}
						}
						l++;
					}
					k0 = k1;
				}
			}
		}
	}

	private void alignVertical(LinkedList<LinkedList<LayeredGraphNode>> layers, Direction dir){
		int layerStart, layerEnd, layerStep;
		boolean topAlign = Direction.isTopDirection(dir);
		boolean leftAlign = Direction.isLeftDirection(dir);	
		
		System.err.printf("topAlign=%b, leftAlign=%b\n", leftAlign, topAlign);
		
		if(topAlign){
			layerStart = 1; layerEnd = layers.size(); layerStep = 1;
		} else {	
			layerStart = layers.size() - 2; layerEnd = -1; layerStep = -1;
		}
		
		for(int i = layerStart; i != layerEnd; i += layerStep){
			LinkedList<LayeredGraphNode> Li = layers.get(i);
			LinkedList<LayeredGraphNode> neighbourLayer = layers.get(i + (topAlign ? -1 : 1));
			
			int r = leftAlign ? -1 : neighbourLayer.size();
			
			int nodeStart, nodeEnd, nodeStep;
			
			if(leftAlign){
				nodeStart = 0; nodeEnd = Li.size(); nodeStep = 1;
			}  else {
				nodeStart = Li.size() - 1; nodeEnd = -1; nodeStep = -1;
			}
			for(int k = nodeStart; k != nodeEnd; k += nodeStep){
				LayeredGraphNode vk = Li.get(k);
				LinkedList<LayeredGraphNode> neighbours = vk.getAllConnectedNeighbours(neighbourLayer);  //leftAlign ? vk.getAllConnectedNeighboursAfter(neighbourLayer, r) :
																	  //vk.getAllConnectedNeighboursBefore(neighbourLayer, r);
				if(debug)printList("vk = " + vk.name + ", r = " + r + ": ", neighbours);
				
				int d = neighbours.size();
				if(d > 0){
					int m1 = (d + 1)/2 - 1;
					int m2 = (d + 2)/2 - 1;
					int [] medians;
					if(m1 == m2) {
						medians = new int[] { m1 };
					} else {
						medians = leftAlign ? new int[] { m1, m2 } : new int[] { m2, m1 };
					}
					
					for(int m : medians){
						if(vk.align == vk){
							LayeredGraphNode um = neighbours.get(m);
							if(isMarked(um, vk))
								System.err.println("Encountered marked edge: " + um.name + " -> " + vk.name);
							if(!isMarked(um, vk) && (leftAlign ? r < um.pos :  um.pos < r)){
								um.align = vk;
								um.blockWidth = Math.max(um.blockWidth, vk.width());
								vk.root = um.root;
								vk.align = vk.root;
								r = um.pos;
								if(debug)System.err.printf("%s.align = %s, %s.root = %s, %s.align = %s\n", um.name, um.align.name, vk.name, vk.root.name, vk.name, vk.root.name);
							}
						}
					}
				}
			}
		}
	}

	private void placeBlock(LinkedList<LinkedList<LayeredGraphNode>> layers, LayeredGraphNode v, Direction dir){
		if(debug)System.err.println("placeBlock: " + v.name + " x = " + v.getX(dir));
		if(v.getX(dir) == -1){
			boolean leftDir = Direction.isLeftDirection(dir);
			//v.setX(dir, leftDir ? v.blockWidth/2 : MAXWIDTH - v.blockWidth/2);
			v.setX(dir, leftDir ? v.width()/2 : MAXWIDTH - v.width()/2);
			//v.setX(dir, leftDir ? 0 : MAXWIDTH);
		
			LayeredGraphNode w = v;
			do {
				if(debug)System.err.println("placeBlock: v = " + v.name + "; v.x = " + v.getX(dir) + " w = " + w.name);
				LinkedList<LayeredGraphNode> layer = layers.get(w.layer);
				if(leftDir ? w.pos > 0 : w.pos < layer.size() - 1){
					
					LayeredGraphNode u = layer.get(w.pos + (leftDir ? -1 : 1)).root;
					placeBlock(layers, u, dir);
					
					if(v.sink == v){
						v.sink = u.sink;
						if(debug)System.err.println("placeBlock: " + v.name + ".sink => " + u.sink.name);
					}
					double xDelta = hgap + (v.root.blockWidth + u.root.blockWidth)/2;
					
					if(v.sink != u.sink){
						double s = leftDir ? v.getX(dir) - u.getX(dir) - xDelta : u.getX(dir) - v.getX(dir) - xDelta;
						
						u.sink.shift = leftDir ? Math.min(u.sink.shift, s) : Math.max(u.sink.shift, s);
						if(debug)System.err.println("placeBlock: " + u.sink.name + ".sink.shift => " + u.sink.shift );
					} else {
						v.setX(dir, leftDir ? Math.max(v.getX(dir), u.getX(dir) + xDelta) : Math.min(v.getX(dir), u.getX(dir) - xDelta));
						if(debug)System.err.println(v.name + ".x -> " + v.getX(dir));
					}
				}
				w = w.align;
			} while (w != v); // && (leftDir ? w.pos > 0 : w.pos < layers.get(w.layer).size() - 1));
		}
		if(debug)System.err.println("placeBlock =>  " + v.name + " x = " + v.getX(dir));
	}
	
	/**
	 * Compact coherent blocks of nodes and assign x coordinates
	 * @param layers	of the graph
	 * @param dir		alignment direction
	 */
	private void compactHorizontal(LinkedList<LinkedList<LayeredGraphNode>> layers, Direction dir){
		for(LayeredGraphNode v : nodes){
			if(debug)System.err.println("compactHorizontal1: " + v.name);
			if(v.root == v)
				placeBlock(layers, v, dir);
		}
		
		boolean leftAligned = Direction.isLeftDirection(dir);
	
		for(LayeredGraphNode v : nodes){
			if(debug)System.err.println("compactHorizontal2: " + v.name);

			v.setX(dir, v.root.getX(dir));
			if(v.root == v && v.root.sink.shift < INFINITY){
				if(leftAligned)
					v.setX(dir, v.getX(dir) + v.root.sink.shift);
				else {
					//v.setX(dir, v.sink.shift - v.getX(dir));
					v.setX(dir,  v.getX(dir) - v.root.sink.shift);
				}
			}
		}
	}
	
	/**
	 * Add y coordinates to all nodes
	 * @param layers	of the graph
	 */
	private void assignY(LinkedList<LinkedList<LayeredGraphNode>> layers){
		
		double y = 0;
		
		for(LinkedList<LayeredGraphNode> layer : layers){
			double hlayer = 0;
			for(LayeredGraphNode g : layer){
				if(!g.isVirtual()){
					
					hlayer = Math.max(hlayer, g.height());
				}
			}
			for(LayeredGraphNode g : layer){
				g.layerHeight = hlayer;
				g.y = y + hlayer/2;
			}
			y += hlayer + vgap;
		}
	}
	
	/**
	 * 
	 * Perform horizontal placement for all 4 alignment directions and average the resulting x coordinates
	 * @param layers	of the graph
	 * @return			modified graph
	 */
	private LinkedList<LinkedList<LayeredGraphNode>>placeHorizontal(LinkedList<LinkedList<LayeredGraphNode>> layers){
		assignY(layers);
		if(debug)System.err.println("assignY done");
		preprocess(layers);
		if(debug)System.err.println("preprocess done");
		
		boolean all = true;
		if(all){
			for(Direction dir : Direction.dirs){
				for(LayeredGraphNode g : nodes){
					g.clearHorizontal();
				}

				alignVertical(layers, dir);
				
				if(debug){
					System.err.println("alignVertical done");
					printGraph("after alignVertical");
				}
				compactHorizontal(layers, dir);
				if(debug){
					printGraph("after compactHorizontal");
					System.err.println("compactHorizontal done");
				}
			}
			for(LayeredGraphNode g : nodes){
				g.averageHorizontal();
			}

		} else {
			
			// Just for testing purposes
			
						Direction 	dir = Direction.TOP_LEFT;
			//			Direction dir = Direction.TOP_RIGHT;
			//			Direction dir = Direction.BOTTOM_LEFT;
			//			Direction dir = Direction.BOTTOM_RIGHT;

			for(LayeredGraphNode g : nodes){
					g.clearHorizontal();
			}
			alignVertical(layers, dir);
			System.err.println("alignVertical done");
			printGraph("after alignVertical");
			compactHorizontal(layers, dir);
			printGraph("after compactHorizontal");
			System.err.println("compactHorizontal done");
		}
		return layers;
	}
	private LinkedList<LayeredGraphEdge> insertEdge(LinkedList<LayeredGraphEdge> layer, LayeredGraphEdge e){
		for(int i = 0; i < layer.size(); i++){
			LayeredGraphEdge f = layer.get(i);
			if(f.labelX > e.labelX){
				layer.add(i, e);
				return layer;
			}
		}
		layer.add(e);
		return layer;
	}
	
	private void placeLabels(LinkedList<LinkedList<LayeredGraphNode>> layers){
		LinkedList<LinkedList<LayeredGraphEdge>> labels = new LinkedList<LinkedList<LayeredGraphEdge>>();
		
		for(int i = 0; i < layers.size(); i++){
			labels.add(new LinkedList<LayeredGraphEdge>());
		}
		
		for(LayeredGraphEdge e : edges){
			if(e.label != null){
				e.setLabelCoordinates();
				int fl = e.getFrom().layer;
				int tl =  e.getTo().layer;
				int level = fl < tl ? fl : tl;
				labels.set(level, insertEdge(labels.get(level), e));
			}
		}
		
		for(LinkedList<LayeredGraphEdge> layerLabels : labels)
			optimizeLabels(layerLabels);
	}
	
	private void optimizeLabels(LinkedList<LayeredGraphEdge> layerLabels){
		for(int i = 0; i < layerLabels.size() - 1; i++){
			LayeredGraphEdge e1 = layerLabels.get(i);
			LayeredGraphEdge e2 = layerLabels.get(i + 1);
			e1.reduceOverlap(e2);
		}
	}
	
	public boolean getFiguresUnderMouse(Coordinate c,Vector<Figure> result){
		if(!mouseInside(c.getX(), c.getY())) return false;
		boolean found = false;
		for(int i = nodes.size()-1 ; i >= 0 ; i--){
			if(nodes.get(i).figure != null && nodes.get(i).figure.getFiguresUnderMouse(c, result)){
				found=true;
				break;
			}
		}
		if(!found){
			for(int i = edges.size()-1 ; i >= 0 ; i--){
				if(edges.get(i).getFiguresUnderMouse(c, result)){
					break;
				}
			}
		}
		result.add(this);
		return true;
	}
	

	public void computeFiguresAndProperties(ICallbackEnv env){
		super.computeFiguresAndProperties(env);
		for(LayeredGraphNode node : nodes){
			node.computeFiguresAndProperties(env);
		}
		for(LayeredGraphEdge edge : edges){
			edge.computeFiguresAndProperties(env);
		}
	}
	

	public void registerNames(NameResolver resolver){
		super.registerNames(resolver);
		for(LayeredGraphNode node : nodes){
			node.registerNames(resolver);
		}
		for(LayeredGraphEdge edge : edges){
			edge.registerNames(resolver);
		}
	}

	@Override
	public void layout() {
		size.set(minSize);
		for(LayeredGraphNode node : nodes){
			node.layout();
		}
		for(LayeredGraphEdge edge : edges){
			edge.layout();
		}
	}
}