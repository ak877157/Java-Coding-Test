package com.org.gen.coding.test;

class Holiday
{
	 private String name;
	 private int date;
	 private String month;
	public Holiday(String name, int date, String month) {
		super();
		this.name = name;
		this.date = date;
		this.month = month;
	}
	
	 String getName() {
		return name;
	}
	 int getDate() {
		return date;
	}
	 String getMonth() {
		return month;
	}
	 
	 
}

public class HolidayDemo {
	public static void main(String[] args) {
		
		Holiday a1 = new Holiday("Dalhousie" , 20 , "August");
		
		System.out.println("Name of holiday :"+a1.getName());
		System.out.println("Holiday Date : "+a1.getDate());
		System.out.println("Holiday Month : "+a1.getMonth());
	}

}
