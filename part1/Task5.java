//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.
package by.home.part1.task5.main;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		int time;
		int hour;
		int min;
		int sec;
		
		System.out.println("Enter T: ");
		while (!s.hasNextInt()) {
			s.next();
			System.out.println("Enter T:");
		}
		time = s.nextInt();

		hour = time / 3600;
		time %= 3600;
		min = time / 60; 
		time %= 60;
		sec = time;

		System.out.println(hour + "h " + min + "min " + sec + "s");
	}
}
