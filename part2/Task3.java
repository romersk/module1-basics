//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой. 
package by.home.part2.task3.main;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double x1, y1;
		double x2, y2;
		double x3, y3;

		System.out.println("Enter x1: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Enter x1:");
		}
		x1 = sc.nextDouble();

		System.out.println("Enter y1: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Enter y1:");
		}
		y1 = sc.nextDouble();

		System.out.println("Enter x2: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Enter x2:");
		}
		x2 = sc.nextDouble();

		System.out.println("Enter y2: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Enter y2:");
		}
		y2 = sc.nextDouble();

		System.out.println("Enter x3: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Enter x3:");
		}
		x3 = sc.nextDouble();

		System.out.println("Enter y3: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Enter y3:");
		}
		y3 = sc.nextDouble();

		if (((x3 - x1) * (y2 - y1) - (x2 - x1) * (y3 - y1)) == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
