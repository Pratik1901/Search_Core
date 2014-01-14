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
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class New_Search_Core extends Template {

	public New_Search_Core(Display display) {
		super(display);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gridData.horizontalSpan = 3;
		gridData.horizontalAlignment = GridData.CENTER;
		add_more_url = new Button(shell, SWT.PUSH);
		delete_more_url = new Button(shell, SWT.PUSH);
		check_url = new Button(shell,SWT.PUSH);
		check_urls = new Button(shell,SWT.PUSH);
		check_file_url = new Button(shell,SWT.PUSH);
		explorer = new Button(shell,SWT.PUSH);
		check_phantom_url = new Button(shell,SWT.PUSH);
		textbox1 = new Text(shell,SWT.BORDER);
		textbox2 = new Text(shell,SWT.BORDER);
		textbox3 = new Text(shell,SWT.BORDER);
		textbox4 = new Text(shell,SWT.BORDER);
		label_desc_font = new Font (display, "Calisto MT", 12, 4);
		label_new_1 = new Label(shell, SWT.LEFT);
		
		label_title.setVisible(false);
		label_desc1.setVisible(false);
		label_desc2.setVisible(false);
		
		label_new_1.setText("Enter URL -");
		label_new_1.setBounds(250, 60,90,20);
		label_new_1.setBackgroundImage(label_title_background);
		label_new_1.setForeground(label_desc_color);
		label_new_1.setFont(label_desc_font);
		
		textbox1.setBounds(350, 60, 180, 20);
		add_more_url.setImage(add_more);
		add_more_url.setBounds(580,60,25,20);
		add_more_url.setLayoutData(gridData);
		
		check_url.setBounds(450, 100, 80, 30);
		check_url.setText("Check URL");
		check_url.setBackgroundImage(label_title_background);
		check_url.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false));
		
		 label_new_2 = new Label(shell, SWT.LEFT);
		    label_new_2.setText("Enter file URL -");
			label_new_2.setBounds(220, 220,110,20);
			label_new_2.setBackgroundImage(label_title_background);
			label_new_2.setForeground(label_desc_color);
			label_new_2.setFont(label_desc_font);
		    textbox3.setBounds(350, 220, 180, 20);
		    check_file_url.setBounds(450, 250, 80, 30);
		    check_file_url.setText("Check file URL");
		    check_file_url.setBackgroundImage(label_title_background);
		    
		    label_new_3 = new Label(shell, SWT.LEFT);
		    label_new_3.setText("Enter URL for Non-Browser -");
			label_new_3.setBounds(220, 340,230,20);
			label_new_3.setBackgroundImage(label_title_background);
			label_new_3.setForeground(label_desc_color);
			label_new_3.setFont(label_desc_font);
			
			check_phantom_url.setBounds(650, 340, 80, 30);
			check_phantom_url.setText("Check URL");
			check_phantom_url.setBackgroundImage(label_title_background);
			check_phantom_url.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false));
			
			explorer.setBounds(580,220,100,20);
			explorer.setText("Add url of file");
	}

}
