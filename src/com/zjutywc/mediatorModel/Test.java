package com.zjutywc.mediatorModel;
/**
 * �н���ģʽ
 * @author yaowc
 * User1��User2�ֱ��ǲ�ͬ�Ķ��󣬶���֮���й���������������н���ģʽ������Ҫ�����໥�������ã��������ߵ���϶Ⱥܸߣ�Ϊ�˽��������Mediator�࣬�ṩͳһ�ӿڣ�MyMediatorΪ��ʵ���࣬�������User1��User2��ʵ��������ʵ�ֶ�User1��User2�Ŀ��ơ�
 * ����User1��User2���������໥����������ֻ��Ҫ���ֺú�Mediator֮��Ĺ�ϵ���У�ʣ�µ�ȫ��MyMediator����ά����
 */
public class Test {
	public static void main(String[] args) {
		Mediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll();
	}
}
