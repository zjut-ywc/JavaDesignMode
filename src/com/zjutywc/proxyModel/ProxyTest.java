package com.zjutywc.proxyModel;
/**
 * 代理模式
 * @author yaowc
 * 使用代理模式，可以将功能划分的更加清晰，有助于后期维护！
 */
public class ProxyTest {
	public static void main(String[] args) {
		Sourceable source = new Proxy();
		source.method();
	}
}
