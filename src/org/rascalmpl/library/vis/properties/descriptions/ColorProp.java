/*******************************************************************************
 * Copyright (c) 2009-2011 CWI
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   * Paul Klint - Paul.Klint@cwi.nl - CWI
 *   * Atze van der Ploeg - Atze.van.der.Ploeg@cwi.nl - CWI
*******************************************************************************/

package org.rascalmpl.library.vis.properties.descriptions;

import java.util.HashMap;

import org.rascalmpl.library.vis.properties.PropertySetters;

public enum ColorProp {
	FILL_COLOR(255),     
	FONT_COLOR(0),    
	LINE_COLOR(0);
	
	int stdDefault;
	
	ColorProp(int stdDefault){
		this.stdDefault = stdDefault;
	}

	@SuppressWarnings("serial")
	public static final HashMap<String, PropertySetters.PropertySetter<ColorProp,Integer>> propertySetters = new HashMap<String, PropertySetters.PropertySetter<ColorProp,Integer>>() {{
	put("fillColor", new PropertySetters.SingleColorPropertySetter(FILL_COLOR));
	put("fontColor", new PropertySetters.SingleColorPropertySetter(FONT_COLOR));
	put("lineColor", new PropertySetters.SingleColorPropertySetter(LINE_COLOR));
	}};

	public Integer getStdDefault() {
		return stdDefault;
	} 
	
	
}