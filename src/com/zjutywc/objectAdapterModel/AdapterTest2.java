package com.zjutywc.objectAdapterModel;
/**
 * �����������ģʽ
 * ��ϣ����һ������ת����������һ���½ӿڵĶ���ʱ�����Դ���һ��Wrapper�࣬����ԭ���һ��ʵ������Wrapper��ķ����У�����ʵ���ķ������С�
 */
import com.zjutywc.classAdapterModel.Targetable;

public class AdapterTest2 {
	public static void main(String[] args) {
		Source source = new Source();  
        Targetable target = new Wrapper(source);  
        target.method1();  
        target.method2();  
	}
}
