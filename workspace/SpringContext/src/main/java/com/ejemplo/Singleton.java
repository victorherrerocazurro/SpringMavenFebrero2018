package com.ejemplo;

public class Singleton {

	private static Singleton instance = new Singleton();
	
	private Singleton() {
		super();
	}
	
	public static Singleton getInstance() {
		return instance;
	}

}
