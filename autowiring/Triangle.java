package com.example.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape{

	@Override
	public Void calculateArea(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("area is: "+(0.5*x*y));
		return null;
	}

}
