package com.dkt.Shapes;

public class Rectangle extends Square {
	protected int otherside;

	public Rectangle(int s, int os) {
		super(s);
		this.otherside = os;

	}

	public Rectangle(int s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	public int getOtherside() {
		return otherside;
	}

	public void setOtherside(int otherside) {
		this.otherside = otherside;
	}

	@Override
	public boolean Draw() {
		
	System.out.println("rectangle: otherside= "+this.otherside + "side="+this.getSide());
	
		// TODO Auto-generated method stub
		return false;
	}

}
