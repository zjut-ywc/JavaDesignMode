package com.zjutywc.mementoModel;
/**
 * 备忘录模式
 * @author yaowc
 * 假设有原始类A，A中有各种属性，A可以决定需要备份的属性，备忘录类B是用来存储A的一些内部状态，类C呢，就是一个用来存储备忘录的，且只能存储，不能修改等操作
 */
public class Test {
	public static void main(String[] args) {
		Original original = new Original("egg");
		
		Storage storage = new Storage(original.createMemento());
		
		System.out.println("初始化状态为：" + original.getValue());
		original.setValue("niu");
		System.out.println("修改后的状态为：" + original.getValue());
		
		original.restoreMemento(storage.getMemento());
		System.out.println("恢复后的状态为：" + original.getValue());
	}
}
