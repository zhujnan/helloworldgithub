package com.day04.cal;

public class AddOperation extends Operation{
	
	@Override
	public double getResult() {
		return getNumA()+getNumB();
	}

}
