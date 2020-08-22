// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
// Определить, пройдет ли кирпич через отверстие.
package by.home.part2.task4.main;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double sizeA;
		double sizeB;
		
		System.out.println("Enter size of hole (A) : ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Enter size of hole (A) : ");
		}
		sizeA = sc.nextDouble();
		
		System.out.println("Enter size of hole (B) : ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Enter size of hole (B) : ");
		}
		sizeB = sc.nextDouble();

		double squareHole;
		squareHole = sizeA * sizeB;

		System.out.println("Enter size of brick (x) : ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Enter size of brick (x) : ");
		}
		double sizeX = sc.nextDouble();
		
		System.out.println("Enter size of brick (y) : ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Enter size of brick (y) : ");
		}
		double sizeY = sc.nextDouble();
		
		System.out.println("Enter size of brick (z) : ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Enter size of brick (z) : ");
		}
		double sizeZ = sc.nextDouble();

		if ((sizeX * sizeY <= squareHole) || (sizeX * sizeZ <= squareHole) || (sizeY * sizeZ <= squareHole)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
