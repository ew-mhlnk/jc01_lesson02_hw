package edu.training.jc.hw;

/* Задача №6: Вычислить значение выражения по формуле. */

public class ValueCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double c;
		double x;
		
		a = 2;
		b = 3;
		c = 4;
		x = (b + Math.sqrt (Math.pow (b, 2) + 4 * a * c)) / ( 2 * a ) - Math.pow ( a, 3) * c + Math.pow (b, -2);
		
		System.out.println("Значение X = "+ x);
	}

}