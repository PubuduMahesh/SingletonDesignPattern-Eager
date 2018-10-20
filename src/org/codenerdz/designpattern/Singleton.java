package org.codenerdz.designpattern;

public class Singleton {
	private static Singleton singletonObject;//Lazy singleton desing pattern.
	
	private Singleton()
	{
		
	}
	
	public static Singleton getInstance()
	{
		if(singletonObject == null)
		{
			singletonObject = new Singleton();
		}
		return singletonObject;
	}
}
