package com.zjutywc.multiFactoryModel;

public class test {
	/**
	 * �����������ģʽ
	 * ����ͨ��������ģʽ�У�������ݵ��ַ�������������ȷ�������󣬶������������ģʽ���ṩ��������������ֱ𴴽�����
	 * @param args
	 */
	public static void main(String[] args) {
		Farm farm = new Farm();
		Eat eat = farm.moggyFoster();
		eat.earGrass();
	}
}
