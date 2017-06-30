package com.zjutywc.bridgeModel;
/**
 * �Ž�ģʽ
 * @author yaowc
 * ��Bridge��ĵ��ã�ʵ���˶Խӿ�Sourceable��ʵ����SourceSub1��SourceSub2�ĵ���
 */
public class BridgeTest {
	public static void main(String[] args) {
		Bridge bridge = new MyBridge();
		
		Sourceable source1 = new Sourceable1();
		bridge.setSource(source1);
		bridge.method();
		
		Sourceable source2 = new Sourceable2();
		bridge.setSource(source2);
		bridge.method();
	}
}
