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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

public class Menus extends Template {

	public Menus(Display display) {
		super(display);
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menuBar = new Menu(shell, SWT.BAR);
		MenuItem cascadeFileMenu1 = new MenuItem(menuBar, SWT.CASCADE);
        cascadeFileMenu1.setText("&New");
        Menu fileNew = new Menu(shell, SWT.DROP_DOWN);
        cascadeFileMenu1.setMenu(fileNew);
        
        newitem = new MenuItem(fileNew, SWT.PUSH);
        newitem .setText("&New Search\tCtrl+N");
        newitem.setAccelerator(SWT.MOD1 + 'N');
        shell.setMenuBar(menuBar);
        
        MenuItem exitItem = new MenuItem(fileNew, SWT.PUSH);
        exitItem.setText("&Exit\tCtrl+Q");
        exitItem.setAccelerator(SWT.MOD1 + 'Q');
        shell.setMenuBar(menuBar);

        MenuItem cascadeFileMenu2 = new MenuItem(menuBar, SWT.CASCADE);
        cascadeFileMenu2.setText("&Help");
        Menu fileHelp = new Menu(shell, SWT.DROP_DOWN);
        cascadeFileMenu2.setMenu(fileHelp);
        
        MenuItem aboutitem = new MenuItem(fileHelp, SWT.PUSH);
        aboutitem .setText("&About");
        shell.setMenuBar(menuBar);
        
        exitItem.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
            	
                shell.getDisplay().dispose();
                System.exit(0);
            }
        });
      }
}