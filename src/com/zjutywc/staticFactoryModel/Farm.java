package com.zjutywc.staticFactoryModel;

//ũ���࣬����ʵ����ţ������
public class Farm {
	public static Eat moggyFoster(){
		return new Moggy();
	}
	
	public static Eat sheepFoster(){
		return new Sheep();
	}
}
