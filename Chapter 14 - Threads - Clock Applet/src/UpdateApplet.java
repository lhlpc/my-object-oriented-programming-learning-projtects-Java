public class UpdateApplet extends java.applet.Applet implements Runnable { 

	private Thread updateThread; 
	int updateInterval = 1000; 

	public void run() { 
		while ( true ) { 
			try {   
				Thread.sleep( updateInterval );  
			}  
			catch (InterruptedException e ) { } 

			repaint(); 
		} 
	} 

	public void start() { 
		if ( updateThread == null ) { 
			updateThread = new Thread(this); 
			updateThread.start(); 
		} 
	} 

	public void stop() { 
		if ( updateThread != null ) { 
			updateThread.stop(); 
			updateThread = null; 
		} 
	} 
} 
