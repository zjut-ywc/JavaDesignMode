package com.zjutywc.simpleFactoryModel;

public class test {
	/**
	 * �򵥹���ģʽ
	 * Eat��ţ����ͬ�ģ��ӿڣ���Farm�ǹ��������ܹ�����ţ������
	 * ����һ��farm������ͨ��foster����������һͷţ��ʵ���˳Եķ�����
	 * @param args
	 */
	public static void main(String[] args) {
		Farm farm = new Farm();
		Eat eat = farm.foster("moggy");
		eat.earGrass();
	}
}
