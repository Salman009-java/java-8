package com.java8.functionalinterfacewithlambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream; 

public class CollectingOnlyEvenNumberFromListUsingCollectMethod {
	
	public static void main(String[] args) {
		
		List<Integer> list=(List<Integer>) Arrays.asList(12,54,23,55,33,68,43,34,54).stream().filter(i->i%2==0).collect(Collectors.toList());
		//List<Integer> list1=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list);
	}

}
