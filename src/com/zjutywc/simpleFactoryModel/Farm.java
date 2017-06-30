package com.zjutywc.simpleFactoryModel;
//农场类，可以实现养牛还是羊
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
