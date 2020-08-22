// Составить программу нахождения произведения квадратов первых двухсот чисел.
package by.home.part3.task4.main;


public class Task4 {
	public static void main(String[] args) {
		
		long sum;
		sum = 1;
		
		long step;
		long prois;
		step = 2;
		
		while (sum>0) {
			prois = step*step;
			sum *= prois;
			step++;
		}
		
		System.out.println("Переполнение на шаге " + step);
	}
}
