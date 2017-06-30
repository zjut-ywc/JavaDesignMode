package com.zjutywc.singletonModel;
/**
 * ����ģʽ
 * ĳЩ�ഴ���Ƚ�Ƶ��������һЩ���͵Ķ�������һ�ʺܴ��ϵͳ������
 * ʡȥ��new��������������ϵͳ�ڴ��ʹ��Ƶ�ʣ�����GCѹ����
 * ��Щ���罻�����ĺ��Ľ������棬�����Ž������̣����������Դ�������Ļ���ϵͳ��ȫ���ˡ�
 * @author yaowc
 *
 */
public class Singleton {
	
	 /* ����˽�о�̬ʵ������ֹ�����ã��˴���ֵΪnull��Ŀ����ʵ���ӳټ��� */  
	private static Singleton instance = null;
	
	 /* ˽�й��췽������ֹ��ʵ���� */  
	private Singleton(){
		
	}
	
	 /* �˴�ʹ��һ���ڲ�����ά������ */  
	private static class SingletonFactory{
		private static Singleton instance = new Singleton();
	}
	
	/* ��ȡʵ�� */  
	public static Singleton getInstance(){
		return SingletonFactory.instance;
	}
	
	 /* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */  
	public Object readResolve(){
		return instance;
	}
}
