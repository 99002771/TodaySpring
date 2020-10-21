package com.example.autowiring;

import org.springframework.stereotype.Component;

@Component("shape")
public class Rectangle implements Shape {

	@Override
	public Void calculateArea(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("area is: "+(x*y));
		return null;
	}

}
