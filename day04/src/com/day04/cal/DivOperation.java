package com.day04.cal;

public class DivOperation extends Operation{

	@Override
	public double getResult() {
		return getNumA()/getNumB();
	}
	
}