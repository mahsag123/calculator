package com.demo.calc;

import com.demo.calc.function.Add;

public class Calculator {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 4;
		
		Add add = new Add();
		int res = add.addNum(a, b);
		System.out.println("addition of two numbers are:"+res);
	}

}
