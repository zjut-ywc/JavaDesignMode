package com.zjutywc.decoratorModel;
/*
 * װ����ģʽ
 * 1����Ҫ��չһ����Ĺ��ܡ�
 * 2����̬��Ϊһ���������ӹ��ܣ����һ��ܶ�̬���������̳в���������һ�㣬�̳еĹ����Ǿ�̬�ģ����ܶ�̬��ɾ����
 * ȱ�㣺�����������ƵĶ��󣬲����Ŵ�
 */
public class DecoratorTest {
	public static void main(String[] args) {
		Sourceable source = new Source();
		Sourceable obj = new Decorator(source);
		obj.method();
	}
}
