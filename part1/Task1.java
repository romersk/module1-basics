//Найдите значение функции: z = ( (a � 3 ) * b / 2) + c

package by.home.part1.task1.main;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int aEnt;
		int bEnt;
		int cEnt;

		System.out.println("Enter a:");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Enter a:");
		}
		aEnt = sc.nextInt();

		System.out.println("Enter b:");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Enter b:");
		}
		bEnt = sc.nextInt();

		System.out.println("Enter c:");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Enter c:");
		}
		cEnt = sc.nextInt();

		double zAnswer = ((aEnt - 3) * bEnt / 2.0) + cEnt;
		
		System.out.println("The answer is " + zAnswer);
	}
}
