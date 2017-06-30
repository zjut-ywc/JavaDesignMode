package com.zjutywc.objectAdapterModel;

import com.zjutywc.objectAdapterModel.Source;

public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is targetable method!");
	}

}
