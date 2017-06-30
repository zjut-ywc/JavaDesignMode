package com.zjutywc.builderModel;

import java.util.ArrayList;
import java.util.List;

public class Builder {
	private List list = new ArrayList<Eat>();
	
	public void builderMoggyfoster(int count){
		for(int i=0;i<count;i++){
			list.add(new Moggy());
		}
	}
	
	public void builderSheepfoster(int count){
		for(int i=0;i<count;i++){
			list.add(new Sheep());
		}
	}
}
