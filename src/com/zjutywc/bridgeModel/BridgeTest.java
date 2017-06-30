package com.zjutywc.bridgeModel;
/**
 * 桥接模式
 * @author yaowc
 * 对Bridge类的调用，实现了对接口Sourceable的实现类SourceSub1和SourceSub2的调用
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
