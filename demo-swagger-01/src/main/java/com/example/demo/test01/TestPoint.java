package com.example.demo.test01;

public class TestPoint {
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 12;
		p1.y = 12;
		Point p2 = new Point();
		p2.x = 12;
		p2.y = 12;
		double x = p1.getDistance(p2);
		System.out.println("两点间的距离为" + x);
	}
}

class Point {
	int x;
	int y;

	public double getDistance(Point p) {
		double r = Math.sqrt(p.x - x) * (p.x - x) + (p.y - y) * (p.y - y);
		return r;
	}
}