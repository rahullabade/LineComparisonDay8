package com.bl.lineComparison;

public class Main {
	public static void main(String[] args) {
		
		Point p1 = new Point();
		p1.x = 6;
		p1.y = 7;

		Point p2 = new Point();
		p2.x = 4;
		p2.y = 5;

		Line l1 = new Line();
		l1.p1 = p1;
		l1.p2 = p2;

		float x = l1.getLengthlineOne();
		System.out.println("Calculate distance between two point : " + x);
	}

}
