package com.zjutywc.multiFactoryModel;
//ũ���࣬����ʵ����ţ������
public class Farm {
	public Eat moggyFoster(){
		return new Moggy();
	}
	
	public Eat sheepFoster(){
		return new Sheep();
	}
}
