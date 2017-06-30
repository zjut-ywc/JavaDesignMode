package com.zjutywc.simpleFactoryModel;

public class test {
	/**
	 * 简单工厂模式
	 * Eat是牛和羊共同的（接口），Farm是工厂，它能够生产牛或者羊。
	 * 创建一个farm工厂，通过foster方法生产了一头牛，实现了吃的方法。
	 * @param args
	 */
	public static void main(String[] args) {
		Farm farm = new Farm();
		Eat eat = farm.foster("moggy");
		eat.earGrass();
	}
}
