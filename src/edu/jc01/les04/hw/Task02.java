package edu.jc01.les04.hw;

public class Task02 {
	public static void main(String[] args) {

		int x1, y1, x2, y2;

		double d;

		x1 = 5;
		x2 = 9;
		y1 = 8;
		y2 = 7;

		d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		System.out.println("Расстояние = " + d);

	}

}
