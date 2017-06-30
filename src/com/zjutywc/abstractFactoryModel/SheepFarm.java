package com.zjutywc.abstractFactoryModel;

public class SheepFarm implements Farm {

	@Override
	public Eat foster() {
		return new Sheep();
	}

}
