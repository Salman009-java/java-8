package com.java8.functionalinterfacewithlambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingUsingSortMethod {
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(4,3,7,4,1,7,9,8,6);
	
		/*//defaul Sorting order
		List<Integer> li2= list.stream().sorted().collect(Collectors.toList());
		
		System.out.println(li2);*/
		List<Integer> li2= list.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());  
		System.out.println(li2);
		
		//minium value using min method
		
		Integer i=list.stream().min((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("Min Value is "+ i);
		//Max Value using Max method
		Integer i2=list.stream().max((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("Max value is : "+i2);
		
	}

}
