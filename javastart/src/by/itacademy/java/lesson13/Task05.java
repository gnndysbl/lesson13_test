package by.itacademy.java.lesson13;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("input N.");
		System.out.print("> ");
		while (!sc.hasNextInt()) {
			sc.nextLine();// извлекли ошибочный ввод пользователя
			System.out.println("input N.");
			System.out.print("> ");
		}
		n = sc.nextInt();

		if (n < 0) {
			n = Math.abs(n);
		}

		System.out.println("N = " + n);

		double a = 1;
		double x = -2 * a;
		double dx = a / 5;
		double y = 0;

		System.out.println("------------------------");
		System.out.printf("| %2s | %6s | %6s |\n", "#", "x", "y");
		System.out.println("------------------------");

		for (int i = 1; i <= n; i++) {

			if (x <= 0) {

				y = (a / 2) * ((Math.pow(Math.E, x / a)) + (Math.pow(Math.E, -x / a)));

			}

			if (x > 0) {

				y = (4 * Math.pow(a, 3)) / ((Math.pow(x, 2)) + (4 * Math.pow(a, 2)));

			}
			System.out.printf("| %2s | %6.3f | %6.3f |\n", i, x, y);

			x = x + dx;
		}
	}

}
