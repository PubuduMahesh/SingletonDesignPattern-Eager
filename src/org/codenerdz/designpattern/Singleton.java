package org.codenerdz.designpattern;

public class Singleton {
	private static Singleton singletonObject;//Lazy singleton desing pattern.
	
	private Singleton()
	{
		System.out.println("create new object");
	}
	
	public static Singleton getInstance()
	{
		if(singletonObject == null)
		{
			synchronized(Singleton.class) 
			{
				if(singletonObject == null)
				{
					singletonObject = new Singleton();					
				}
				
			}
		}
		return singletonObject;
	}
}
