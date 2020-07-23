package com.java8.functionalinterfacewithlambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

interface A{
	
	int MAX=100;
	
}

interface B{
	int MAX=100;
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceA a = (x, y) -> {
			System.out.println("lambda expression with implementation");
			return x + y;
		};
		System.out.println(a.m1(10, 20));
	}

	}
	
	
	

