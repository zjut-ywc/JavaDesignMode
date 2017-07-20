package com.zjutywc.stateModel;
/**
 * 状态模式
 * @author yaowc
 * 当对象的状态改变时，同时改变其行为
 * 状态模式就两点：1、可以通过改变状态来获得不同的行为。2、你的好友能同时看到你的变化。
 */
public class Test {
	public static void main(String[] args) {
		State state = new State();
		Context context = new Context(state);
		
		state.setValue("state1");
		context.method();
		
		state.setValue("state2");
		context.method();
	}
}
