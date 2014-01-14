/*******************************************************************************
 * Copyright (c) 2000, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
//package org.eclipse.swt.snippets;
/*
 * example snippet: set icons with different resolutions
 *
 * For a list of all SWT example snippets see
 * http://www.eclipse.org/swt/snippets/
 * 
 * @since 3.0
 */
package design;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

public class Images extends Template {

	public Images(Display display) {
		super(display);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		favicon = new Image(display, "C:\\Program Files\\Link Pro\\Image\\Favicon.jpg");
		shell_background = new Image(display, "C:\\Program Files\\Link Pro\\Image\\Shell Background.jpg");
		label_title_background = new Image(display, "C:\\Program Files\\Link Pro\\Image\\Label Title Background.jpg");
		add_more = new Image(display, "C:\\Program Files\\Link Pro\\Image\\Add More.gif");
		delete_more = new Image(display, "C:\\Program Files\\Link Pro\\Image\\delete.png");
	}
}