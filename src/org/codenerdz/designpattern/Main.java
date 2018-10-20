package org.codenerdz.designpattern;

public class Main {
	
	public static void main (String[] arg)
	{
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Singleton.getInstance();
				
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Singleton.getInstance();
				
			}
		});
		
		thread1.start();
		thread2.start();
	}
}
