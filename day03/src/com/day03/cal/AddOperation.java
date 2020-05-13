package com.day03.cal;

public class AddOperation {
	private double NumA;
	private double NumB;
	
	public AddOperation(double numA, double numB) {
		super();
		NumA = numA;
		NumB = numB;
	}
	
	public double getResult() {
		return NumA + NumB;
	}
}
