package com.zjutywc.staticFactoryModel;

public class test {
	/**
	 * ��̬��������ģʽ
	 * ������Ķ����������ģʽ��ķ�����Ϊ��̬�ģ�����Ҫ����ʵ����ֱ�ӵ��ü���
	 * ������˵������ģʽ�ʺϣ����ǳ����˴����Ĳ�Ʒ��Ҫ���������Ҿ��й�ͬ�Ľӿ�ʱ������ͨ����������ģʽ���д�����
	 * �����ϵ�����ģʽ�У���һ�����������ַ������󣬲�����ȷ�������󣬵���������ڵڶ��֣�����Ҫʵ���������࣬���ԣ����������£����ǻ�ѡ�õ����֡�����̬��������ģʽ��
	 * @param args
	 */
	public static void main(String[] args) {
		Eat eat = Farm.moggyFoster();
		eat.earGrass();
	}
}