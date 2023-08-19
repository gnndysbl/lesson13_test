package by.itacademy.java.lesson13;

// Задается n точек на плоскости. Записать логическое выражение,
// соответствующее заданной области истинности. Подсчитать количество точек,
// попавших в заданную область.

public class Task04 {

	public static void main(String[] args) {

		int n = 30;
		int counter = 0;

		for (int i = 0; i <= n; i++) {

			double x = Math.random() * 5 - 3;
			double y = Math.random() * 5 - 3;

			if ((x <= 0 & x >= -2 & y >= 0 & y <= 2) | (x >= 0 & x <= 2 & y >= -1 & y <= 1)) {

				System.out.print("точка ");
				System.out.printf("[ %5.2f ][ %5.2f ]", x, y);
				System.out.print(" в заданном диапазоне" + "\n");
				counter++;

			}

		}

		System.out.println("\n" + "из " + n + " точек - " + counter + " находятся в заданном диапазоне");

	}
}
