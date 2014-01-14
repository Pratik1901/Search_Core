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

import java.util.List;

import net.jsourcerer.webdriver.jserrorcollector.JavaScriptError;

import org.eclipse.swt.widgets.Display;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public class Standards extends Template {
	
	public Standards(Display display) {
		super(display);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Dimension size1 = new Dimension(2000, 2000);
		driver.manage().window().setSize(size1);
		WebElement footerSection=driver.findElement(By.className("navigationBar"));
		List<WebElement> links=footerSection.findElements(By.tagName("a"));
		System.out.println("Total nos of footer Links - "+links.size());
		for(int i=0;i<links.size();i++)
		{
		//System.out.println(+i);
		footerSection=driver.findElement(By.className("navigationBar"));
		links=footerSection.findElements(By.tagName("a"));
		int j = i+1 ;
		System.out.println(j +"-" +links.get(i).getText());
		List<JavaScriptError> jsErrors = JavaScriptError.readErrors(driver);
		for(int ik = 0; ik < jsErrors.size(); ik++) 
		{
			System.out.println(jsErrors.get(ik).getErrorMessage());
			System.out.println(jsErrors.get(ik).getLineNumber());
			System.out.println(jsErrors.get(ik).getSourceName());
		} 
	    links.get(i).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

		}
		driver.close();
		}
}