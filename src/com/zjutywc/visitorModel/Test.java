package com.zjutywc.visitorModel;
/**
 * ������ģʽ
 * @author yaowc
 * ����������ݽṹ����Ϊ�ķ�����ͨ�����ַ��룬�ɴﵽΪһ���������߶�̬����µĲ������������������޸ĵ�Ч��
 * 1���¹��ܻ᲻�������й��ܳ��ּ��������⣿2���Ժ�᲻������Ҫ��ӣ�3������಻�����޸Ĵ�����ô�죿
 */
public class Test {
	public static void main(String[] args) {
		Visitor visitor = new MyVisitor();
		Subject sub = new MySubject();
		sub.accept(visitor);
	}
}
