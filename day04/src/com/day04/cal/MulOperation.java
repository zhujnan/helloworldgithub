package com.day04.cal;

public class MulOperation extends Operation{

	@Override
	public double getResult() {
		return getNumA()*getNumB();
	}
	
}