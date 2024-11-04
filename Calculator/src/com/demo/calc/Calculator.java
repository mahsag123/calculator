package com.demo.calc;

import com.demo.calc.function.Add;
import com.demo.calc.function.Division;
import com.demo.calc.function.Multiply;

public class Calculator {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 4;
		
		Add add = new Add();
		int res = add.addNum(a, b);
		System.out.println("addition of two numbers are:"+res);
		
		Multiply multiply = new Multiply();
		int resMul = multiply.multiplication(a, b);
		System.out.println("Multiplication of two numbers: "+resMul);
		
		Division division = new Division();
		int resDiv = division.division(a, b);
		System.out.println("resDiv of two numbers: "+resDiv);
		
	}

}
