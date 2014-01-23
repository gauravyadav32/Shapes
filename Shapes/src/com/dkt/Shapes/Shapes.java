package com.dkt.Shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Shapes {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Shape> shapes=new ArrayList<Shape>();
	shapes.add(new Rectangle(5, 6));
	shapes.add(new Circle(4));
	shapes.add(new Triangle(6,7,8));
	shapes.add(new Square(6));
	ListIterator<Shape> it=shapes.listIterator();
	while(it.hasNext()){
		it.next().Draw();
	}
	

	}

}
