package com.zjutywc.simpleFactoryModel;
//ũ���࣬����ʵ����ţ������
public class Farm {
	public Eat foster(String type){
		if("moggy".equals(type)){
			return new Moggy();
		}else if("sheep".equals(type)){
			return new Sheep();
		}else{
			return null;
		}
	}
}
