package by.itacademy.java.lesson13;

public class Task06 {

	public static void main(String[] args) {

		double a = 3.0 * Math.pow(10, 3.0);
		double b = 6.0 * Math.pow(10, 4.0);
		double m = 4.0;

		double from = -30.0;
		double to = 60.0;
		double area = Math.abs((from - to));
		int n = 20;
		double step = area / (n + 1);
		double y = 0;

		int counter = 0;

		System.out.println("-------------------------------------------------------------");
		System.out.printf("| %2s | %11s | %11s | %11s | %11s |\n", "#", "k", "y", "y range from", "y range to");
		System.out.println("-------------------------------------------------------------");

		double t1 = Math.sqrt(a + b + m);
		double t2 = m * Math.sqrt(a + b);
		double t3 = Math.sqrt(a * b * m);
		double t4 = m * Math.sqrt(a * b);

		if (t2 < t1) {
			double change;
			change = t1;
			t1 = t2;
			t2 = change;
		}

		if (t4 < t3) {
			double change1;
			change1 = t3;
			t3 = t4;
			t4 = change1;
		}

		// добавил в цикл 0.000001 из-за округлений. без 0.000001 k будет на верхней
		// границе диапазонв

		for (double i = from + step; i < to - 0.000001; i = i + step) {
			y = Math.pow(i, 3) - (25 * Math.pow(i, 2)) + 50 * i + 1000;

			if (t1 < y & y < t2) {

				counter++;
				System.out.printf("| %2s | %11.3f | %11.3f | %12.3f | %11.3f | %11s   \n", counter, i, y, t1, t2,
						"[t1 - t2]");

			}

			else if (t3 < y & y < t4) {
				counter++;
				System.out.printf("| %2s | %11.3f | %11.3f | %12.3f | %11.3f | %11s   \n", counter, i, y, t3, t4,
						"[t3 - t4]");

			}

		}

		int ammountOutOfRange = n - counter;
		System.out.println("\n" + "another " + ammountOutOfRange + " values are out of ranges ");

		// ниже вывод 20ти значений функции в пределах диапазона, не включая нижнюю и
		// верхнюю границу

		counter = 0;

		System.out.println("\n\n\n");

		System.out.println("---------------------------------");
		System.out.printf("| %2s | %11s | %11s |\n", "#", "k", "y");
		System.out.println("---------------------------------");
		for (double i = from + step; i < to - 0.000001; i = i + step) {

			y = Math.pow(i, 3) - (25 * Math.pow(i, 2)) + 50 * i + 1000;

			counter++;
			System.out.printf("| %2s | %11.3f | %11.3f |   \n", counter, i, y);

		}
	}
}
