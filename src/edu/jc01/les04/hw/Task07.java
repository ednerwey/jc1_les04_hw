package edu.jc01.les04.hw;

public class Task07 {

	public static void main(String[] args) {
		
		int a = -17;
		int b = 21;

		double arf, geom;

		arf = (Math.pow(a, 2) + Math.pow(b, 2)) / 2;
		geom = Math.sqrt(Math.abs(a) * Math.abs(b));

		System.out.println("Cреднее арифметическое = " + arf + "\nСреднее геометрическое = " + geom);

	}

}
