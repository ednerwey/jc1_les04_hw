package edu.jc01.les04.hw;

public class Task04 {

	public static void main(String[] args) {

		int r = 10;
		int a = 30;

		double l, s;

		l = Math.PI * r * a / 180;
		s = Math.PI * Math.pow(r, 2) * a / 360;

		System.out.println("Длина дуги сектора = " + l + "\nПлощадь сектора = " + s);
	}

}
