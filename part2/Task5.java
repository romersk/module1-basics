// Вычислить значение функции:
// x<=3 : x^2 - 3x + 9
// x>3 : 1/(x^3+6)
package by.home.part2.task5.main;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		double x;
		
		System.out.println("Enter x: ");
		while (!s.hasNextDouble()) {
			s.next();
			System.out.println("Enter x: ");
		}
		x = s.nextDouble();
		
		double fx;
		if (x<=3) {
			fx = x*x - 3*x + 9;
		} else {
			fx = 1.0/(Math.pow(x, 3) + 6);
		}
		System.out.format("F(x) = %.4f", fx);
	}
}
