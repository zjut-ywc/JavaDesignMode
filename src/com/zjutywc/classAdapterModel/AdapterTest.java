package com.zjutywc.classAdapterModel;
/**
 * ���������ģʽ
 * @author yaowc
 * ��ϣ����һ����ת����������һ���½ӿڵ���ʱ������ʹ�����������ģʽ������һ�����࣬�̳�ԭ�е��࣬ʵ���µĽӿڼ��ɡ�
 */
public class AdapterTest {
	public static void main(String[] args) {
		Targetable target = new Adapter();
		target.method1();
		target.method2();
	}
}
