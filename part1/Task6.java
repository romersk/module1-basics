// Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
// принадлежит закрашенной области, и false — в противном случае:
package by.home.part1.task6.main;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		double x;
		double y;
		
		System.out.println("Enter x: ");
		while (!s.hasNextDouble()) {
			s.next();
			System.out.println("Enter x:");
		}
		x = s.nextDouble();

		System.out.println("Enter y: ");
		while (!s.hasNextDouble()) {
			s.next();
			System.out.println("Enter y:");
		}
		y = s.nextDouble();

		System.out.println(((y < 4) & (-3 < y) & (x < 2) & (-2 < x)) | ((y < 0) & (-3 < y) & (x < 4) & (-4 < x)));
		// проверка двух областей: первая (y=4,y=-3,x=2,x=-2), вторая
		// (y=0,y=-3,x=-4,x=4)

	}
}
