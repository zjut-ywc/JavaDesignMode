package com.zjutywc.stateModel;
/**
 * ״̬ģʽ
 * @author yaowc
 * �������״̬�ı�ʱ��ͬʱ�ı�����Ϊ
 * ״̬ģʽ�����㣺1������ͨ���ı�״̬����ò�ͬ����Ϊ��2����ĺ�����ͬʱ������ı仯��
 */
public class Test {
	public static void main(String[] args) {
		State state = new State();
		Context context = new Context(state);
		
		state.setValue("state1");
		context.method();
		
		state.setValue("state2");
		context.method();
	}
}
