//Вычислить значения функции на отрезке [а,b] c шагом h:
//x>2 : x
// x<=2 : -x
package by.home.part3.task2.main;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		double a;
		double b;
		double h;
		
		System.out.println("Enter a: ");
		while (!s.hasNextInt()) {
			s.next();
			System.out.println("Enter a: ");
		}
		a = s.nextDouble();
		
		System.out.println("Enter b: ");
		while (!s.hasNextInt()) {
			s.next();
			System.out.println("Enter b: ");
		}
		b = s.nextDouble();
		
		System.out.println("Enter h: ");
		while (!s.hasNextInt()) {
			s.next();
			System.out.println("Enter h: ");
		}
		h = s.nextDouble();

		double start;
		start = a;
		while (start <= b) {
			if (start <= 2) {
				System.out.format("Y(%.3f) = %.3f%n", start, start);
			} else {
				System.out.format("Y(%.3f) = %.3f%n", start, -start);
			}
			start += h;
		}

		if (start > b && start <= 2) {
			System.out.format("Y(%.3f) = %.3f", b, b);
		} else if (start > b) {
			System.out.format("Y(%.3f) = %.3f", b, -b);
		}
	}
}
