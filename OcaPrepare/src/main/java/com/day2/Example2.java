package com.day2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Example2 {
	public static void main(String[] args) {
		
	  LocalDate start=LocalDate.of(2015, Month.JANUARY, 1);
	  LocalDate end=LocalDate.of(2015,Month.MARCH,30);
	    if(start.isBefore(end))
	    {
	    	LocalDate newDate=start.plusMonths(1);
	    	System.out.println(newDate);
	    	//System.out.println("5+2=" +(3+4));
	    	LocalDate today=LocalDate.parse("2019-11-11");
	    	System.out.println(today);
	    	
	    }
	    LocalTime time= LocalTime.of(24,45);
	    System.out.println(time);
	    
	    LocalTime time1= LocalTime.of(897689888,45);
	    System.out.println(time1);
}
}

