package com.zjutywc.observerModel;
/**
 * �۲���ģʽ
 * @author yaowc
 * MySubject��������ǵ�������Observer1��Observer2��������MySubject�Ķ��󣬵�MySubject�仯ʱ��Observer1��Observer2��Ȼ�仯��
 * AbstractSubject���ж�������Ҫ��صĶ����б����Զ�������޸ģ����ӻ�ɾ������ض����ҵ�MySubject�仯ʱ������֪ͨ���б��ڴ��ڵĶ���
 */
public class ObserverTest {
	public static void main(String[] args) {
		Subject sub = new MySubject();
		sub.add(new Observer1());
		sub.add(new Observer2());
		sub.operation();
	}
}
