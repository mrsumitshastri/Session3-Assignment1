package com.Session3.Assignment1;

import java.util.Scanner;
import java.math.*;
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class mathExample {
	public static void main(String[] args) {
		mathCalculation m = new mathCalculation();
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Value for calculate Sqrt/Cube");
		m.setNumber(scan.nextDouble()); 
		System.out.println("Enter enter your choice,\n For Sqrt = 1 \n For Cube = 2 \n For both = 3");
		m.option = scan.nextInt();
		switch (m.option) {
		case 1:
			m.calculateSqrt();
			break;
		case 2:
			m.calculateCube();
			break;

		default:
			m.calculateBoth();
			break;
		}
		
	}

}
