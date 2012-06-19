@license{
  Copyright (c) 2009-2011 CWI
  All rights reserved. This program and the accompanying materials
  are made available under the terms of the Eclipse Public License v1.0
  which accompanies this distribution, and is available at
  http://www.eclipse.org/legal/epl-v10.html
}
module experiments::Concept::FcaLattices
import vis::Figure;
import vis::Render; 
import util::Dot;
import experiments::Concept::DotVis;

public void renderLegacy() {
   Figure g = dot2fig(legacy);
   render(g);
   }

public void renderGewaesser() {
   Figure g = dot2fig(gewaesser);
   render(g);
   }
   
public void renderLiveInWater() {
   Figure g = dot2fig(liveinwater);
   render(g);
   }

public void renderTealady() {
   Figure g = dot2fig(tealady);
   render(g);
   }
   
DotGraph legacy = digraph("fca",[NODE([<"style","filled">,<"fillcolor","cornsilk">,<"fontcolor","blue">,<"shape","ellipse">]),N("\"0\""),N("\"1\""),N("\"2\""),N("\"3\""),N("\"4\""),N("\"5\""),E("\"1\"","\"2\""),E("\"3\"","\"1\""),E("\"0\"","\"4\""),E("\"0\"","\"5\""),E("\"4\"","\"2\""),E("\"0\"","\"3\""),E("\"5\"","\"1\"")]);
DotGraph gewaesser = digraph("fca",[NODE([<"style","filled">,<"fillcolor","cornsilk">,<"fontcolor","blue">,<"shape","ellipse">]),N("\"0\""),N("\"1\""),N("\"2\""),N("\"3\""),N("\"4\""),N("\"5\""),N("\"6\""),N("\"7\""),N("\"8\""),N("\"9\""),N("\"10\""),N("\"11\""),N("\"12\""),N("\"13\""),N("\"14\""),N("\"16\""),N("\"17\""),N("\"15\""),N("\"18\""),N("\"19\""),N("\"20\""),N("\"21\""),N("\"22\""),N("\"23\""),N("\"24\""),N("\"25\""),N("\"26\""),N("\"27\""),E("\"19\"","\"25\""),E("\"17\"","\"7\""),E("\"2\"","\"18\""),E("\"3\"","\"21\""),E("\"8\"","\"13\""),E("\"20\"","\"6\""),E("\"0\"","\"26\""),E("\"27\"","\"10\""),E("\"0\"","\"20\""),E("\"16\"","\"2\""),E("\"12\"","\"18\""),E("\"22\"","\"23\""),E("\"26\"","\"3\""),E("\"1\"","\"24\""),E("\"4\"","\"14\""),E("\"27\"","\"16\""),E("\"23\"","\"7\""),E("\"7\"","\"18\""),E("\"0\"","\"1\""),E("\"1\"","\"17\""),E("\"15\"","\"21\""),E("\"0\"","\"22\""),E("\"27\"","\"24\""),E("\"9\"","\"25\""),E("\"26\"","\"15\""),E("\"13\"","\"7\""),E("\"11\"","\"4\""),E("\"19\"","\"21\""),E("\"20\"","\"15\""),E("\"24\"","\"12\""),E("\"21\"","\"18\""),E("\"9\"","\"2\""),E("\"10\"","\"14\""),E("\"0\"","\"27\""),E("\"5\"","\"19\""),E("\"11\"","\"9\""),E("\"8\"","\"17\""),E("\"26\"","\"10\""),E("\"8\"","\"9\""),E("\"17\"","\"2\""),E("\"6\"","\"12\""),E("\"20\"","\"23\""),E("\"3\"","\"14\""),E("\"0\"","\"5\""),E("\"10\"","\"12\""),E("\"0\"","\"8\""),E("\"24\"","\"2\""),E("\"22\"","\"19\""),E("\"0\"","\"11\""),E("\"22\"","\"13\""),E("\"13\"","\"25\""),E("\"15\"","\"12\""),E("\"14\"","\"18\""),E("\"1\"","\"6\""),E("\"16\"","\"14\""),E("\"11\"","\"16\""),E("\"23\"","\"21\""),E("\"25\"","\"18\""),E("\"5\"","\"3\""),E("\"5\"","\"4\""),E("\"4\"","\"25\""),E("\"6\"","\"7\"")]);
DotGraph liveinwater =digraph("fca",[NODE([<"style","filled">,<"fillcolor","cornsilk">,<"fontcolor","blue">,<"shape","ellipse">]),N("\"0\""),N("\"1\""),N("\"2\""),N("\"3\""),N("\"4\""),N("\"5\""),N("\"6\""),N("\"7\""),N("\"8\""),N("\"9\""),N("\"10\""),N("\"11\""),N("\"12\""),N("\"13\""),N("\"14\""),N("\"15\""),N("\"16\""),N("\"17\""),N("\"18\""),E("\"6\"","\"14\""),E("\"1\"","\"4\""),E("\"3\"","\"4\""),E("\"16\"","\"13\""),E("\"16\"","\"11\""),E("\"18\"","\"1\""),E("\"2\"","\"5\""),E("\"14\"","\"13\""),E("\"13\"","\"17\""),E("\"10\"","\"3\""),E("\"12\"","\"8\""),E("\"18\"","\"15\""),E("\"0\"","\"14\""),E("\"11\"","\"9\""),E("\"15\"","\"2\""),E("\"10\"","\"11\""),E("\"15\"","\"4\""),E("\"9\"","\"17\""),E("\"5\"","\"17\""),E("\"12\"","\"6\""),E("\"14\"","\"5\""),E("\"4\"","\"17\""),E("\"12\"","\"18\""),E("\"0\"","\"2\""),E("\"1\"","\"13\""),E("\"12\"","\"7\""),E("\"8\"","\"16\""),E("\"3\"","\"9\""),E("\"7\"","\"10\""),E("\"7\"","\"1\""),E("\"7\"","\"16\""),E("\"18\"","\"0\"")]);
DotGraph tealady = digraph("fca",[NODE([<"style","filled">,<"fillcolor","cornsilk">,<"fontcolor","blue">,<"shape","ellipse">]),N("\"0\""),N("\"29\""),N("\"30\""),N("\"1\""),N("\"2\""),N("\"3\""),N("\"31\""),N("\"32\""),N("\"4\""),N("\"33\""),N("\"34\""),N("\"5\""),N("\"35\""),N("\"36\""),N("\"37\""),N("\"6\""),N("\"7\""),N("\"8\""),N("\"38\""),N("\"9\""),N("\"39\""),N("\"40\""),N("\"10\""),N("\"41\""),N("\"11\""),N("\"42\""),N("\"12\""),N("\"43\""),N("\"13\""),N("\"44\""),N("\"14\""),N("\"45\""),N("\"46\""),N("\"47\""),N("\"16\""),N("\"15\""),N("\"17\""),N("\"18\""),N("\"48\""),N("\"19\""),N("\"20\""),N("\"49\""),N("\"50\""),N("\"21\""),N("\"51\""),N("\"52\""),N("\"22\""),N("\"53\""),N("\"54\""),N("\"55\""),N("\"56\""),N("\"23\""),N("\"24\""),N("\"25\""),N("\"57\""),N("\"58\""),N("\"59\""),N("\"60\""),N("\"26\""),N("\"61\""),N("\"62\""),N("\"63\""),N("\"27\""),N("\"64\""),N("\"28\""),E("\"20\"","\"54\""),E("\"19\"","\"20\""),E("\"16\"","\"46\""),E("\"57\"","\"5\""),E("\"50\"","\"52\""),E("\"36\"","\"11\""),E("\"20\"","\"43\""),E("\"13\"","\"14\""),E("\"64\"","\"7\""),E("\"21\"","\"59\""),E("\"27\"","\"57\""),E("\"9\"","\"14\""),E("\"10\"","\"35\""),E("\"5\"","\"34\""),E("\"4\"","\"46\""),E("\"9\"","\"58\""),E("\"36\"","\"18\""),E("\"31\"","\"13\""),E("\"43\"","\"47\""),E("\"32\"","\"49\""),E("\"48\"","\"47\""),E("\"0\"","\"34\""),E("\"59\"","\"63\""),E("\"6\"","\"43\""),E("\"1\"","\"54\""),E("\"44\"","\"2\""),E("\"31\"","\"55\""),E("\"45\"","\"16\""),E("\"10\"","\"8\""),E("\"28\"","\"32\""),E("\"18\"","\"1\""),E("\"51\"","\"47\""),E("\"29\"","\"0\""),E("\"31\"","\"56\""),E("\"18\"","\"28\""),E("\"10\"","\"51\""),E("\"29\"","\"5\""),E("\"14\"","\"45\""),E("\"20\"","\"21\""),E("\"28\"","\"41\""),E("\"33\"","\"16\""),E("\"11\"","\"57\""),E("\"38\"","\"2\""),E("\"8\"","\"40\""),E("\"19\"","\"62\""),E("\"37\"","\"7\""),E("\"8\"","\"48\""),E("\"38\"","\"33\""),E("\"55\"","\"53\""),E("\"31\"","\"9\""),E("\"15\"","\"63\""),E("\"52\"","\"39\""),E("\"58\"","\"51\""),E("\"50\"","\"38\""),E("\"41\"","\"26\""),E("\"53\"","\"25\""),E("\"52\"","\"25\""),E("\"39\"","\"3\""),E("\"32\"","\"26\""),E("\"18\"","\"6\""),E("\"25\"","\"60\""),E("\"61\"","\"59\""),E("\"39\"","\"21\""),E("\"13\"","\"44\""),E("\"46\"","\"15\""),E("\"24\"","\"63\""),E("\"52\"","\"33\""),E("\"11\"","\"30\""),E("\"26\"","\"63\""),E("\"40\"","\"59\""),E("\"29\"","\"28\""),E("\"55\"","\"23\""),E("\"62\"","\"21\""),E("\"41\"","\"59\""),E("\"17\"","\"30\""),E("\"50\"","\"23\""),E("\"52\"","\"62\""),E("\"1\"","\"12\""),E("\"21\"","\"49\""),E("\"56\"","\"58\""),E("\"43\"","\"59\""),E("\"36\"","\"17\""),E("\"6\"","\"12\""),E("\"3\"","\"24\""),E("\"31\"","\"50\""),E("\"16\"","\"35\""),E("\"61\"","\"24\""),E("\"0\"","\"41\""),E("\"47\"","\"63\""),E("\"6\"","\"41\""),E("\"23\"","\"25\""),E("\"45\"","\"4\""),E("\"19\"","\"8\""),E("\"12\"","\"26\""),E("\"1\"","\"32\""),E("\"27\"","\"29\""),E("\"51\"","\"24\""),E("\"53\"","\"22\""),E("\"5\"","\"32\""),E("\"14\"","\"33\""),E("\"39\"","\"61\""),E("\"56\"","\"11\""),E("\"11\"","\"1\""),E("\"35\"","\"61\""),E("\"8\"","\"43\""),E("\"55\"","\"44\""),E("\"64\"","\"49\""),E("\"9\"","\"53\""),E("\"54\"","\"47\""),E("\"28\"","\"21\""),E("\"13\"","\"38\""),E("\"9\"","\"19\""),E("\"54\"","\"49\""),E("\"30\"","\"12\""),E("\"31\"","\"42\""),E("\"49\"","\"63\""),E("\"31\"","\"36\""),E("\"18\"","\"20\""),E("\"37\"","\"30\""),E("\"4\"","\"48\""),E("\"23\"","\"2\""),E("\"25\"","\"16\""),E("\"22\"","\"60\""),E("\"45\"","\"10\""),E("\"62\"","\"40\""),E("\"53\"","\"45\""),E("\"42\"","\"37\""),E("\"58\"","\"54\""),E("\"56\"","\"64\""),E("\"12\"","\"47\""),E("\"34\"","\"26\""),E("\"7\"","\"63\""),E("\"3\"","\"49\""),E("\"30\"","\"34\""),E("\"17\"","\"6\""),E("\"9\"","\"52\""),E("\"48\"","\"15\""),E("\"60\"","\"46\""),E("\"56\"","\"37\""),E("\"58\"","\"3\""),E("\"42\"","\"17\""),E("\"22\"","\"4\""),E("\"2\"","\"16\""),E("\"44\"","\"45\""),E("\"17\"","\"0\""),E("\"40\"","\"15\""),E("\"36\"","\"27\""),E("\"35\"","\"40\"")]);