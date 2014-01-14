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

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

public class Labels extends Template {

	public Labels(Display display) {
		super(display);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gridData.grabExcessHorizontalSpace = true;
		label_title_font = new Font (display, "Calisto MT", 15, 4);
		label_desc_font = new Font (display, "Calisto MT", 12, 4);
		label_desc_color = new Color(display,255,255,255);
		label_title_color = new Color(display,255,255,255); 
		label_desc_color = new Color(display,255,255,255); 
		
		label_title = new Label(shell,SWT.LEFT);
		label_desc1 = new Label(shell, SWT.LEFT);
		label_desc2 = new Label(shell, SWT.LEFT);
		
		label_title.setText("Welcome to Link-Pro (Beta) Version");
		label_title.setBounds(440, 40,200,19);
		label_title.setFont(label_title_font);
		label_title.setForeground(label_title_color);
		label_title.setBackgroundImage(label_title_background);
		label_title.setLayoutData(gridData);
		
		label_desc1.setText("Please click on the 'New Search' in the New Menu option for New Search after adding");
		label_desc1.setBounds(280, 110,1000,18);
		label_desc1.setBackgroundImage(label_title_background);
		label_desc1.setForeground(label_desc_color);
		label_desc1.setFont(label_desc_font);

		label_desc2.setText("url, or New Search getting url from textfile or want to run scripts ghostly.");
		label_desc2.setBounds(280, 140,1000,18);
		label_desc2.setBackgroundImage(label_title_background);
		label_desc2.setForeground(label_desc_color);
		label_desc2.setFont(label_desc_font);
	}
}