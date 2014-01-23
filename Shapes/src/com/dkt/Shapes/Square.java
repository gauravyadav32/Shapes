package com.dkt.Shapes;

public class Square implements Shape {
	protected int side;

	public Square(int s) {
		this.side = s;

	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public boolean Draw() {
		System.out.println("Square : side="+this.side);
		// TODO Auto-generated method stub
		return false;
	}

}
