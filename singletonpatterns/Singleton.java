package com.sunxiaohang.singletonpatterns;

public class Singleton {
	private volatile static Singleton uniqeInstance=null;
	private Singleton(){};
	public static synchronized Singleton getInstance(){
		if(uniqeInstance==null){
			synchronized (Singleton.class) {
				if(uniqeInstance==null){
					uniqeInstance=new Singleton();
				}
			}
		}
		return uniqeInstance;
	}
}