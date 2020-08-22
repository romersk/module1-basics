// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
package by.home.part3.task8.main;

import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int saved_num;
		int temp;
		int[] myArray = new int[10];
		int fnum;
		int snum;

		System.out.println("Enter 1 num: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Enter 1 num: ");
		}
		fnum = sc.nextInt();

		System.out.println("Enter 2 num: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Enter 2 num: ");
		}
		snum = sc.nextInt();

		while (fnum > 0) {
			saved_num = fnum % 10;
			fnum /= 10;
			temp = snum;
			while (temp > 0) {
				if (temp % 10 == saved_num) {
					myArray[temp % 10]++;
				}
				temp /= 10;
			}
		}

		for (int i = 0; i < 10; i++) {
			if (myArray[i] != 0) {
				System.out.print(i + " ");
			}
		}

	}
}
