//Найти max{min(a, b), min(c, d)}
package by.home.part2.task2.main;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double minAB;
		double minCD;

		double a;
		double b;
		double c;
		double d;

		System.out.println("Enter a: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Enter a:");
		}
		a = sc.nextDouble();

		System.out.println("Enter b: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Enter b:");
		}
		b = sc.nextDouble();

		System.out.println("Enter c: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Enter c:");
		}
		c = sc.nextDouble();

		System.out.println("Enter d: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Enter d:");
		}
		d = sc.nextDouble();

		if (a <= b) {
			minAB = a;
		} else {
			minAB = b;
		}

		if (c <= d) {
			minCD = c;
		} else {
			minCD = d;
		}

		if (minAB > minCD) {
			System.out.println("The answer is " + minAB);
		} else {
			System.out.println("The answer is " + minCD);
		}
	}
}
