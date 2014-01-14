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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import net.jsourcerer.webdriver.jserrorcollector.JavaScriptError;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.ShellEvent;
import org.eclipse.swt.events.ShellListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tray;
import org.eclipse.swt.widgets.TrayItem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Template {

	static Display display;
	static Shell shell;
	static Image favicon,shell_background,label_title_background,add_more,delete_more;
	static Font label_title_font,label_desc_font;
	static Color label_title_color,label_desc_color;
	static Label label_title,label_desc1,label_desc2,label_new_1,separator,label_new_2,firefoxbro,chromebro,iebro,firefoxbrotxt,chromebrotxt,iebrotxt,separator1,label_new_3;
	static Text textbox1,textbox2,textbox3,textbox4,text;
	static Menu menuBar;
	static Button add_more_url,delete_more_url,check_url,check_urls,check_file_url,checkbox1,checkbox2,checkbox3,checkbox4,checkbox5,checkbox6,explorer,check_phantom_url;
	static MenuItem newitem;
	static WebDriver driver;
	static GridLayout gridLayout;
	static GridData gridData;
	static FileDialog dialog;
	
public Template(Display display) {
	shell = new Shell(display);
	shell.setMaximized(true);
	shell.setText("Link-Pro (Beta) Version");
	shell.setSize(950, 550);
	Monitor primary = display.getPrimaryMonitor();
    Rectangle bounds = primary.getBounds();
    Rectangle rect = shell.getBounds();
    
    int x = bounds.x + (bounds.width - rect.width) / 2;
    int y = bounds.y + (bounds.height - rect.height) / 2;
    
    shell.setLocation(x, y);
	shell.open();
	gridLayout = new GridLayout(3, false);
	gridData = new GridData(GridData.FILL_HORIZONTAL);
	shell.setLayout(gridLayout);
	shell.addShellListener(new ShellListener(){
		
		@Override
		public void shellActivated(ShellEvent event) {
			// TODO Auto-generated method stub
			}

		@Override
		public void shellClosed(ShellEvent event) {
			// TODO Auto-generated method stubs
			 MessageBox messageBox = new MessageBox(shell, SWT.APPLICATION_MODAL | SWT.YES | SWT.NO);
		        messageBox.setText("Link-Pro");
		        messageBox.setMessage("Do you want to close the application?");
		        if (messageBox.open() == SWT.YES)
		          event.doit = true;
		        else
		          event.doit = false;
		        }

		@Override
		public void shellDeactivated(ShellEvent arg0) {
			// TODO Auto-generated method stub
			}

		@Override
		public void shellDeiconified(ShellEvent arg0) {
			// TODO Auto-generated method stub
			}

		@Override
		public void shellIconified(ShellEvent arg0) {
			// TODO Auto-generated method stub
			}});

	String[] args = null;
	Images.main(args);
	shell.setImage(favicon);
	shell.setBackgroundImage(shell_background);
	dialog = new FileDialog(shell, SWT.SAVE | SWT.CANCEL);
	Tray tray = display.getSystemTray();
	if (tray == null) {
	      System.out.println("The system tray is not available");
	    } else {
	      final TrayItem item = new TrayItem(tray, SWT.NONE);
	      item.setToolTipText("SWT TrayItem");
	      item.setImage(favicon);
	      item.addListener(SWT.Show, new Listener() {
	        public void handleEvent(Event event) {
	          System.out.println("show");
	        }
	      });
	      item.addListener(SWT.Hide, new Listener() {
	          public void handleEvent(Event event) {
	            System.out.println("hide");
	          }
	        });
	        item.addListener(SWT.Selection, new Listener() {
	          public void handleEvent(Event event) {
	            System.out.println("selection");
	          }
	        });
	        item.addListener(SWT.DefaultSelection, new Listener() {
	          public void handleEvent(Event event) {
	            System.out.println("default selection");
	          }
	        });
	    }
	initUI_menu();
	initUI_label(null);
	while (!shell.isDisposed()) {
	   if (!display.readAndDispatch()) {
	       display.sleep();
	        }
	       }
}
	
private void initUI_menu() {
	String[] args = null;
	Menus.main(args);
	newitem.addSelectionListener(new SelectionAdapter() {
    @Override
    public void widgetSelected(SelectionEvent e) {
    newsearch();
    }
    });
}

public void initUI_label(String[] args) {
	Labels.main(args);
}
	
public void newsearch() {
	String[] args1 = null;
	New_Search_Core.main(args1);
	String[] args = null;
	Browsers_Setup.main(args);
	separator = new Label(shell, SWT.HORIZONTAL | SWT.SEPARATOR);
	separator.setLayoutData(gridData);
	separator.setBounds(170, 180,700, 10);
	separator.setBackgroundImage(shell_background);
	separator1 = new Label(shell, SWT.HORIZONTAL | SWT.SEPARATOR);
	separator1.setLayoutData(gridData);
	separator1.setBounds(170, 320,700, 10);
	separator1.setBackgroundImage(shell_background);
	textbox4.setBounds(450, 340, 180, 20);
	
	explorer.addSelectionListener(new SelectionAdapter() {
		public void widgetSelected(SelectionEvent e) {
	    dialog.setFilterNames(new String[] { "Text Files", "All Files (*.*)" });
	    dialog.setFilterExtensions(new String[] { "*.txt", "*.*" });
	    dialog.open();
	    if(dialog.getFilterPath().isEmpty())
	    {
	    	dialog.getOverwrite();
	    }
	    else
	    {
	    String texting = dialog.getFilterPath().toString();
	    textbox3.setText(texting+"\\" + dialog.getFileName());
	    }
	    }});
	    check_file_url.addSelectionListener(new SelectionAdapter() {
            @Override
        public void widgetSelected(SelectionEvent e) {
        File file = new File(textbox3.getText());
		FileReader fileReader = null;
		String test1 = null;
		
		/*Chrome Selected Browser*/
		if(checkbox5.getSelection()==true) {
        try {
        fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuffer stringBuffer = new StringBuffer();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
        stringBuffer.append(line);
        stringBuffer.append("\n");
        test1 = stringBuffer.toString();	
        }
        driver_chrome_text(test1);
        fileReader.close();
        } 
        catch (FileNotFoundException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
        } 
        catch (IOException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
        }	
        }
        /*IE Selected Browser*/
        else if(checkbox6.getSelection()==true) {
        try {
        fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuffer stringBuffer = new StringBuffer();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
        stringBuffer.append(line);
        stringBuffer.append("\n");
        test1 = stringBuffer.toString();	
        }
        driver_ie_text(test1);
        fileReader.close();
        }
        catch (FileNotFoundException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
        } 
        catch (IOException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
        }	
        }
        else {
        /* Default unselected browser.*/
        try {
        fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuffer stringBuffer = new StringBuffer();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
        stringBuffer.append(line);
        stringBuffer.append("\n");
        test1 = stringBuffer.toString();	
        }
        driver_text(test1);
        fileReader.close();
        } 
        catch (FileNotFoundException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
        } 
        catch (IOException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
        }
        }
        }});
	    check_phantom_url.addSelectionListener(new SelectionAdapter() {
        @Override
        public void widgetSelected(SelectionEvent e) {
        driver_phantom();
        }
        });
	    check_url.addSelectionListener(new SelectionAdapter() {
        @Override
        public void widgetSelected(SelectionEvent e) {
        driver();
        }
        });
		add_more_url.addSelectionListener(new SelectionAdapter() {
        @Override
        public void widgetSelected(SelectionEvent e) {
        check_url.setVisible(false);
        textbox2.setBounds(350, 90, 180, 20);
        check_urls.setBounds(450, 120, 80, 30);
        check_urls.setText("Check URLs");
        check_urls.setBackgroundImage(label_title_background);
        delete_more_url.setImage(delete_more);
        delete_more_url.setBounds(580,90,25,20);
        check_urls.addSelectionListener(new SelectionAdapter() {
        @Override
        public void widgetSelected(SelectionEvent e) {
        driver();
        }
        });
        }
        });
		delete_more_url.addSelectionListener(new SelectionAdapter() {
        @Override
        public void widgetSelected(SelectionEvent e) {
        check_url.setVisible(true);
        textbox2.setVisible(false);
        delete_more_url.setVisible(false);
        check_urls.setVisible(false);
        newsearch();
        }});
}
public void driver() {
	FirefoxProfile ffProfile = new FirefoxProfile();
	try {
	JavaScriptError.addExtension(ffProfile);
	} 
	catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	driver = new FirefoxDriver(ffProfile);
	if(textbox2.isVisible()==true) {
	driver.get("http://"+textbox1.getText()+"/");
	String a[] = {textbox1.getText()};
	Standards.main(a);
	driver.get("http://"+textbox2.getText()+"/");
	String b[] = {textbox1.getText()};
	Standards.main(b);
	driver.close();
	}
	else {
	driver.get("http://"+textbox1.getText()+"/");
	String c[] = {textbox1.getText()};
	Standards.main(c);
	driver.close();
	}
}
public void driver_text(String at) throws IOException {
	driver = new FirefoxDriver();
	String a = null;
	String[] splitString = at.split("\n");
	for(int i = 0; i < splitString.length; i++) {
	if( splitString[i].length() > 0 ) {
	a = splitString[i].trim();
	System.out.println(i +" "+ a);
	URL pp = new URL(a);
	String ask = pp.toString();
	driver.get(ask);
	Standards.main(splitString);
	}
	}
}
public void driver_chrome_text(String ats) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Link Pro\\Jar Files\\chromedriver.exe");
	driver = new ChromeDriver();
	String a = null;
	String[] splitString = ats.split("\n");
	for(int i = 0; i < splitString.length; i++) {
	if( splitString[i].length() > 0 ) {
	a = splitString[i].trim();
	System.out.println(i +" "+ a);
	URL pp = new URL(a);
	String ask = pp.toString();
	driver.get(ask);
	Standards_Chrome.main(splitString);
	}
	}
}
public void driver_ie_text(String ats) throws IOException {
	System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Link Pro\\Jar Files\\IEDriverServer.exe");
	driver = new InternetExplorerDriver();
	String a = null;
	String[] splitString = ats.split("\n");
	for(int i = 0; i < splitString.length; i++) {
	if( splitString[i].length() > 0 ) {
	a = splitString[i].trim();
	System.out.println(i +" "+ a);
	URL pp = new URL(a);
	String ask = pp.toString();
	driver.get(ask);
	Standards_IE.main(splitString);
	}
	}
}
public void driver_phantom() {
	DesiredCapabilities caps = new DesiredCapabilities();
    caps.setJavascriptEnabled(true);
    caps.setCapability("takesScreenshot", true);
    caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"C:\\Program Files\\Link Pro\\phantomjs-1.9.2-windows\\phantomjs.exe");
	driver = new PhantomJSDriver(caps);
	driver.get("http://" + textbox4.getText() + "/");
	String c[] = {textbox4.getText()};
	Standards_Phantom.main(c);
	driver.close();
}

public static void main(String args[]) {
	Display display = new Display();
    new Template(display);     
    display.dispose();
	}
}
