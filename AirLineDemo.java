package com.org.gen.coding.test;
import java.util.*;

class WeightLimitExceeded extends Exception{
	WeightLimitExceeded(int a) {
		// TODO Auto-generated constructor stub
		System.out.println(Math.abs(15-a)+"KG");
	}
}
public class AirLineDemo {
	
	void validWeight(int weight) throws WeightLimitExceeded {
		if(weight>15) {
			throw new WeightLimitExceeded(weight);
		}
		else {
			System.out.println("Less than 15kg, allowed to fly");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AirLineDemo ar = new AirLineDemo();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<2;i++) {
			System.out.println("Enter the weight : ");
			try {
				ar.validWeight(sc.nextInt());
			} catch (WeightLimitExceeded e) {
				System.out.println(e);
				// TODO: handle exception
			}
		}

	}

}
