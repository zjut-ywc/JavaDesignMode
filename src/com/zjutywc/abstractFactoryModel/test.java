package com.zjutywc.abstractFactoryModel;

public class test {
	/**
	 * ���󹤳�ģʽ
	 * ������������࣬����һ����Ҫ�����µĹ��ܣ�ֱ�������µĹ�����Ϳ����ˣ�����Ҫ�޸�֮ǰ�Ĵ���
	 * @param args
	 */
	public static void main(String[] args) {
		Farm farm = new MoggyFarm();
		Eat eat = farm.foster();
		eat.earGrass();
	}
}
