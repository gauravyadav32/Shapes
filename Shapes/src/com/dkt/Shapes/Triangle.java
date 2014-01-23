package com.dkt.Shapes;

public class Triangle implements Shape {
	protected int side1;
	protected int side2;
	protected int side3;

	public Triangle(int s1, int s2, int s3) {
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;

	}

	public int getSide1() {
		return side1;
	}

	public void setSide1(int side1) {
		this.side1 = side1;
	}

	public int getSide2() {
		return side2;
	}

	public void setSide2(int side2) {
		this.side2 = side2;
	}

	public int getSide3() {
		return side3;
	}

	public void setSide3(int side3) {
		this.side3 = side3;
	}

	@Override
	public boolean Draw() {
		System.out.println("Triangle : side="+ this.side1+" , side2 ="+ this.side2+" , side3="+this.side3);
		
		// TODO Auto-generated method stub
		return false;
	}
}
