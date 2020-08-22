//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.
package by.home.part3.task7.main;

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int n_p;
		int m_p;
		
		System.out.println("Enter N: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Enter N: ");
		}
		n_p = sc.nextInt();

		System.out.println("Enter M: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Enter M: ");
		}
		m_p = sc.nextInt();

		if (m_p > n_p) {
			System.out.println("M more than N");
			System.exit(0);
		}

		for (int i = m_p; i <= n_p; i++) {
			
			boolean how;
			how = false;
			int num = i / 2 + 1;
			
			System.out.print(i + " : ");
			for (int j = 2; j <= num; j++) {
				if (i % j == 0) {
					System.out.print(j + " ");
					how = true;
				}
			}
			
			if (!how) {
				System.out.format("-");
			}
			
			System.out.format("%n");
		}

	}
}
