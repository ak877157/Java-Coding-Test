package com.org.gen.coding.test;

class Rectangle{
	double length;
	double width;
	
	void setRectangle(double length, double widht) {
		this.length=length;
		this.width=width;
	}
	double getArea() {
		return length * width;
	}
}

class Box extends Rectangle{
	double height;
	
	void setBox(double length, double width, double height) {
		setRectangle(length,width);
		this.height=height;
	}
	
	double getVolume() {
		return getArea() * height;
	}
}

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box b = new Box();
		b.setBox(13.5, 11.5, 10.5);
		
		System.out.println("The volume is : "+b.getVolume());

	}

}
