package com.zjutywc.mementoModel;
/**
 * ����¼ģʽ
 * @author yaowc
 * ������ԭʼ��A��A���и������ԣ�A���Ծ�����Ҫ���ݵ����ԣ�����¼��B�������洢A��һЩ�ڲ�״̬����C�أ�����һ�������洢����¼�ģ���ֻ�ܴ洢�������޸ĵȲ���
 */
public class Test {
	public static void main(String[] args) {
		Original original = new Original("egg");
		
		Storage storage = new Storage(original.createMemento());
		
		System.out.println("��ʼ��״̬Ϊ��" + original.getValue());
		original.setValue("niu");
		System.out.println("�޸ĺ��״̬Ϊ��" + original.getValue());
		
		original.restoreMemento(storage.getMemento());
		System.out.println("�ָ����״̬Ϊ��" + original.getValue());
	}
}
