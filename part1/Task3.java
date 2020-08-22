//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//(sinx+cosy)/(cosx-siny) * tgx*y
package by.home.part1.task3.main;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		double x;
		double y;

		System.out.println("Enter x: ");
		while (!s.hasNextDouble()) {
			s.next();
			System.out.println("Enter x:");
		}
		x = s.nextDouble();

		System.out.println("Enter y: ");
		while (!s.hasNextDouble()) {
			s.next();
			System.out.println("Enter y:");
		}
		y = s.nextDouble();

		double temp;
		temp = Math.sin(x) + Math.cos(y);
		temp /= (Math.cos(x) - Math.sin(y));
		temp *= Math.tan(x * y);

		System.out.format("The answer is %.3f", temp);
	}
}
