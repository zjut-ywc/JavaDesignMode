package com.zjutywc.singletonModel;
/**
 * 单例模式
 * 某些类创建比较频繁，对于一些大型的对象，这是一笔很大的系统开销。
 * 省去了new操作符，降低了系统内存的使用频率，减轻GC压力。
 * 有些类如交易所的核心交易引擎，控制着交易流程，如果该类可以创建多个的话，系统完全乱了。
 * @author yaowc
 *
 */
public class Singleton {
	
	 /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */  
	private static Singleton instance = null;
	
	 /* 私有构造方法，防止被实例化 */  
	private Singleton(){
		
	}
	
	 /* 此处使用一个内部类来维护单例 */  
	private static class SingletonFactory{
		private static Singleton instance = new Singleton();
	}
	
	/* 获取实例 */  
	public static Singleton getInstance(){
		return SingletonFactory.instance;
	}
	
	 /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
	public Object readResolve(){
		return instance;
	}
}
