package by.itacademy.java.lesson13;

public class Task07 {

	public static void main(String[] args) {

		int n = 10;
		double x = 21.0;
		double hx = 0.5;

		int m = 7;
		double z = 8.6;
		double hz = 1.5;

		double y;

		if (m != n) {

			System.out.println("		variable x");
			System.out.println("-----------------------------------------------");
			System.out.printf("| %2s | %11s | %11s | %11s |\n", "#", "y", "x", "z");
			System.out.println("-----------------------------------------------");

			for (int i = 1; i <= n; i++) {

				y = Math.sqrt(Math.pow(z, 2) + Math.pow(x, 2)) + Math.abs(Math.log(z)) /

						(Math.sqrt(Math.pow(x, 2) - Math.pow(z, 2) + 3.2));

				System.out.printf("| %2s | %11.3f | %11.3f | %11.3f |\n", i, y, x, z);

				x = x + hx;

			}

			System.out.println("\n\n\n" + "		variable z");
			System.out.println("-----------------------------------------------");
			System.out.printf("| %2s | %11s | %11s | %11s |\n", "#", "y", "x", "z");
			System.out.println("-----------------------------------------------");

			for (int i = 1; i <= m; i++) {

				y = Math.sqrt(Math.pow(z, 2) + Math.pow(x, 2)) + Math.abs(Math.log(z)) /

						(Math.sqrt(Math.pow(x, 2) - Math.pow(z, 2) + 3.2));

				System.out.printf("| %2s | %11.3f | %11.3f | %11.3f |\n", i, y, x, z);

				z = z + hz;
			}
			
		} else {

			System.out.println("		x & z are variable");
			System.out.println("-----------------------------------------------");
			System.out.printf("| %2s | %11s | %11s | %11s |\n", "#", "y", "x", "z");
			System.out.println("-----------------------------------------------");

			for (int i = 1; i <= n; i++) {

				y = Math.sqrt(Math.pow(z, 2) + Math.pow(x, 2)) + Math.abs(Math.log(z)) /

						(Math.sqrt(Math.pow(x, 2) - Math.pow(z, 2) + 3.2));

				System.out.printf("| %2s | %11.3f | %11.3f | %11.3f |\n", i, y, x, z);

				x = x + hx;
				z = z + hz;

			}
		}
	}
}
