package com.zjutywc.multiFactoryModel;
//农场类，可以实现养牛还是羊
public class Farm {
	public Eat moggyFoster(){
		return new Moggy();
	}
	
	public Eat sheepFoster(){
		return new Sheep();
	}
}
