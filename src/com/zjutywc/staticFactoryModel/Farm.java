package com.zjutywc.staticFactoryModel;

//农场类，可以实现养牛还是羊
public class Farm {
	public static Eat moggyFoster(){
		return new Moggy();
	}
	
	public static Eat sheepFoster(){
		return new Sheep();
	}
}
