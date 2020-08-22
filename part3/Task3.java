// Найти сумму квадратов первых ста чисел.
package by.home.part3.task3.main;

public class Task3 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i=1; i<=100; i++) {
			sum += i*i;
		}
		
		System.out.println("The answe is " + sum);
	}
}
