package com.zjutywc.abstractFactoryModel;

public class MoggyFarm implements Farm{

	@Override
	public Eat foster() {
		return new Moggy();
	}

}
