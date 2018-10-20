package org.codenerdz.designpattern;

public class Singleton {
	private static Singleton singletonObject= new Singleton();//Eager singleton desing pattern.
	
	private Singleton()
	{
		
	}
	
	public static Singleton getInstance()
	{
		return singletonObject;
	}
}
