//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
//он прямоугольным.
package by.home.part2.task1.main;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double alpha;
		double betta;
		double sum;

		System.out.println("Enter 1 angle: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Enter 1 angle:");
		}
		alpha = sc.nextDouble();

		System.out.println("Enter 2 angle: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Enter 2 angle: ");
		}
		betta = sc.nextDouble();

		sum = alpha + betta;
		if (sum > 180) {
			System.out.println("There is not triangle");
		} else if (sum == 90) {
			System.out.println("There is right triangle");
		} else {
			System.out.println("There is triangle, but not right");
		}
	}
}
