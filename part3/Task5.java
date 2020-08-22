//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//заданному е. Общий член ряда имеет вид:: a(n) = 1/(2^n) + 1/(3^n)
package by.home.part3.task5.main;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		double a_n;
		double sum = 0;
		int n;
		double e;
		
		System.out.println("Enter n: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Enter n: ");
		}
		n = sc.nextInt();

		System.out.println("Enter e: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Enter e: ");
		}
		e = sc.nextDouble();

		for (int i = 1; i <= n; i++) {
			a_n = 1.0 / Math.pow(2, i) + 1.0 / Math.pow(3, i);
			if (Math.abs(a_n) >= e) {
				sum += a_n;
			}
		}

		System.out.format("The answer is %.4f", sum);
	}
}
