package edu.jc01.les04.hw;

public class Task03 {

	public static void main(String[] args) {
		int x1 = 3;
		int y1 = 7;
		int x2 = 4;
		int y2 = 2;
		int x3 = 9;
		int y3 = 0;
		double a, b, c;

		a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

		System.out.println("Первый катет = " + a + "\nВторой катет = " + b + "\nГипотенуза = " + c);

	}

}
