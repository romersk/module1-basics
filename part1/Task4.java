// Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//дробную и целую части числа и вывести полученное значение числа.

package by.home.part1.task4.main;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		double rEnt;
		int rez1;
		double rez2;

		System.out.println("Enter R: ");
		while (!s.hasNextDouble()) {
			s.next();
			System.out.println("Enter R:");
		}
		rEnt = s.nextDouble();

		rez1 = (int) rEnt; // целая часть
		rez2 = rEnt - rez1; // дробная часть

		double tmp1;
		double tmp2;

		tmp1 = (rez2 * 1000);
		tmp2 = rez1 / 1000.0;

		double answer;
		answer = tmp1 + tmp2;
		System.out.format("The answer =  %.3f", answer);
	}
}
