//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//все числа от 1 до введенного пользователем числа.
package by.home.part3.task1.main;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int N = 0;

		while (N <= 0) {
			System.out.println("Enter A(>0) : ");
			while (!s.hasNextInt()) {
				s.next();
				System.out.println("Enter A(>0) : ");
			}
			N = s.nextInt();
		}
		
		int sum = 0;
		int i;
		for (i=1; i<=N; i++) {
			sum += i;
		}
		
		System.out.println("The sum = " + sum);
	}
}
