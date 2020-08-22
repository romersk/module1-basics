// Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//(b + sqrt(b^2+4ac) )/2a - b*a^3 + b^(-2)

package by.home.part1.task2.main;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		double a;
		double b;
		double c;
		
		System.out.println("Enter a:");
		while (!s.hasNextInt()) {
			s.next();
			System.out.println("Enter a:");
		}
		a = s.nextDouble();

		System.out.println("Enter b:");
		while (!s.hasNextInt()) {
			s.next();
			System.out.println("Enter b:");
		}
		b = s.nextDouble();

		System.out.println("Enter c:");
		while (!s.hasNextInt()) {
			s.next();
			System.out.println("Enter a:");
		}
		c = s.nextDouble();

		double temp;
		temp = Math.sqrt(b * b + 4 * a * c);
		temp += b;
		temp /= 2 * a;
		temp -= Math.pow(a, 3) * b;
		temp += Math.pow(b, -2);

		System.out.format("The answer is %.3f", temp);
	}
}
