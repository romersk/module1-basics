//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
package by.home.part3.task6.main;

public class Task6 {
	public static void main(String[] args) {
		char c;

		for (int i = 1; i <= 255; i++) {
			c = (char) i;
			System.out.println(i + " - " + c);
		}
	}
}
