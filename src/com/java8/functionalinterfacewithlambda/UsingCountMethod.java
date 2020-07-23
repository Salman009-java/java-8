package com.java8.functionalinterfacewithlambda;

import java.util.Arrays;
import java.util.List;

public class UsingCountMethod {

	public static void main(String[] args) {
		
		List<String> list=(List<String>) Arrays.asList("salman","sk","shahrukh","SRK","Amair","AK");
		
		Long sum=list.stream().filter(i->i.length()<=3).count();
	
		System.out.println("total String whose length is <= 2 is :"+sum);
	}
}
