package design;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Shell;


public class SplashScreenCreate  {
	public SplashScreenCreate(final Display display) {
	Font splash_font;
	Color splash_color;
	final Image image = new Image(display, 500, 400);
    GC gc = new GC(image);
    gc.setBackground(display.getSystemColor(SWT.COLOR_DARK_CYAN));
    gc.fillRectangle(image.getBounds());
    splash_font = new Font (display, "Calisto MT", 12, 4);
    splash_color = new Color(display,255,255,255);
    gc.setFont(splash_font);
    gc.setForeground(splash_color);
    gc.drawText("Welcome to Link-Pro", 20, 30);
    gc.drawText("© Copyright Link-pro™ contributers and", 10, 210);
    gc.drawText("other 2013.All rights researved.",10,225);
    gc.dispose();
    
    final Shell splash = new Shell(SWT.ON_TOP);
    final ProgressBar bar = new ProgressBar(splash, SWT.NONE);
    bar.setMaximum(11);
    Label label = new Label(splash, SWT.NONE);
    label.setImage(image);
    FormLayout layout = new FormLayout();
    splash.setLayout(layout);
    FormData labelData = new FormData();
    labelData.right = new FormAttachment(100, 0);
    labelData.bottom = new FormAttachment(100, 0);
    label.setLayoutData(labelData);
    FormData progressData = new FormData();
    progressData.left = new FormAttachment(0, 5);
    progressData.right = new FormAttachment(100, -5);
    progressData.bottom = new FormAttachment(100, -5);
    bar.setLayoutData(progressData);
    splash.pack();
    Rectangle splashRect = splash.getBounds();
    Rectangle displayRect = display.getBounds();
    int x = (displayRect.width - splashRect.width) / 2;
    int y = (displayRect.height - splashRect.height) / 2;
    splash.setLocation(x, y);
    splash.open();
    try 
    {
    	bar.setSelection(5);
		Thread.sleep(1000);
	}
    catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    display.asyncExec(new Runnable (){
	  		@Override
			public void run() {
			new Template(display);
			}
  	});
  	splash.close();
	}
	public static void main(String args[])
	{
		Display display = new Display();
		new SplashScreenCreate(display);
		display.dispose();
	}
}