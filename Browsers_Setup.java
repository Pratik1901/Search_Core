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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

public class Browsers_Setup extends Template {

	public Browsers_Setup(Display display) {
		super(display);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkbox1 = new Button(shell, SWT.CHECK);
		checkbox1.setBounds(720, 50, 15,20);
		checkbox1.setBackgroundImage(shell_background);
		
		firefoxbro = new Label(shell, SWT.LEFT);
		firefoxbro.setText("Firefox");
		firefoxbro.setBounds(750, 50, 55, 20);
		firefoxbro.setFont(label_desc_font);
		firefoxbro.setForeground(label_desc_color);
		firefoxbro.setBackgroundImage(shell_background);
		
		checkbox2 = new Button(shell, SWT.CHECK);
		checkbox2.setBounds(720, 80, 15,20);
		checkbox2.setBackgroundImage(shell_background);
		
		chromebro = new Label(shell, SWT.LEFT);
		chromebro.setText("Chrome");
		chromebro.setBounds(750, 80, 65, 20);
		chromebro.setFont(label_desc_font);
		chromebro.setForeground(label_desc_color);
		chromebro.setBackgroundImage(shell_background);
		
		checkbox3 = new Button(shell, SWT.CHECK);
		checkbox3.setBounds(720, 110, 15,20);
		checkbox3.setBackgroundImage(shell_background);
	
		iebro = new Label(shell, SWT.LEFT);
		iebro.setText("Internet Explorer");
		iebro.setBounds(750, 110, 125, 20);
		iebro.setFont(label_desc_font);
		iebro.setForeground(label_desc_color);
		iebro.setBackgroundImage(shell_background);
		
		checkbox4 = new Button(shell, SWT.CHECK);
		checkbox4.setBounds(720, 220, 15,20);
		checkbox4.setBackgroundImage(shell_background);
		firefoxbrotxt = new Label(shell, SWT.LEFT);
		firefoxbrotxt.setText("Firefox");
		firefoxbrotxt.setBounds(750, 220, 55, 20);
		firefoxbrotxt.setFont(label_desc_font);
		firefoxbrotxt.setForeground(label_desc_color);
		firefoxbrotxt.setBackgroundImage(shell_background);
		
		checkbox5 = new Button(shell, SWT.CHECK);
		checkbox5.setBounds(720, 250, 15,20);
		checkbox5.setBackgroundImage(shell_background);
		chromebrotxt = new Label(shell, SWT.LEFT);
		chromebrotxt.setText("Chrome");
		chromebrotxt.setBounds(750, 250, 65, 20);
		chromebrotxt.setFont(label_desc_font);
		chromebrotxt.setForeground(label_desc_color);
		chromebrotxt.setBackgroundImage(shell_background);
		
		checkbox6 = new Button(shell, SWT.CHECK);
		checkbox6.setBounds(720, 280, 15,20);
		checkbox6.setBackgroundImage(shell_background);
		iebrotxt = new Label(shell, SWT.LEFT);
		iebrotxt.setText("Internet Explorer");
		iebrotxt.setBounds(750, 280, 125, 20);
		iebrotxt.setFont(label_desc_font);
		iebrotxt.setForeground(label_desc_color);
		iebrotxt.setBackgroundImage(shell_background);
	}

}
