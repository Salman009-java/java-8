package com.java8.functionalinterfacewithlambda;

import java.time.LocalDate;
import java.time.LocalTime;

public class DisplayDataAndTimeUsingJava8 {

	public static void main(String[] args) {
		
		LocalDate l=LocalDate.now();
		System.out.println("current date is :"+ l);
		
		LocalTime  t=LocalTime.now();
		System.out.println("current time is  "+ t);
		
		int dm=l.getDayOfMonth();
		int dw=l.getMonthValue();
		int yy=l.getYear();
		System.out.println(dm+"  "+dw+" "+yy);
		
	}
}
