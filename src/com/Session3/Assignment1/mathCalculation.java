package com.Session3.Assignment1;

import java.util.Scanner;

import com.sun.org.apache.regexp.internal.recompile;

public class mathCalculation {
	private double number;
	public int option;
	public double value;
	
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	
	public void calculateSqrt ()
	{
		System.out.println("Sqrt of this number "+number+" is : " + Math.sqrt(number));
	}
	public void calculateCube ()
	{
		System.out.println("Cube of this number "+number+" is : " + Math.cbrt(number));
	}
	public void calculateBoth ()
	{
		this.calculateSqrt();
		this.calculateCube();
	}
}
