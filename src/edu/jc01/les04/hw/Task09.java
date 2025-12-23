package edu.jc01.les04.hw;

public class Task09 {

	public static void main(String[] args) {
		int a = 20;
		double s, d, r_op, r_vp;

		s = Math.pow(a, 2);
		d = a * Math.sqrt(2);
		r_vp = a / 2;
		r_op = a / Math.sqrt(2);

		System.out.println("Площадь = " + s + "\nДиагональ = " + d + "\nРадиус вписанной окружности = " + r_vp
				+ "\nРадиус описанной окружности = " + r_op);

	}

}
