package com.dkt.Shapes;

public class Circle implements Shape {
	protected int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Circle(int r) {
		this.radius = r;
	}

	@Override
	public boolean Draw() {
		System.out.println("Circle: radius= "+ this.radius);
		
		// TODO Auto-generated method stub
		return false;
	}
}
