package com.acme.utils;

public class MyDate {
	public int day;
	public int month;
	public int year;
	
	public MyDate(){
		
	}
	
	public MyDate(int m, int d, int y){
		setDate(m,d,y);
	}
	
	public String toString(){
        String s = month +"/" + day + "/" + year;
		return s;
	}
	
	public void setDate(int m, int d, int y){
		day = d;
		month = m;
		year = y;
	} 

	 public static void leapYears() {
		 for (int i = 1752; i <= 2020; i = i + 4) {
			 if ((i % 100 != 0) || (i % 400 == 0))
			 System.out.println("The year " + i + " is a leap year");
		 }
	 }
	
}
