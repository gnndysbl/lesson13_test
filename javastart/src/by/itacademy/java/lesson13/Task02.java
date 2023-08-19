package by.itacademy.java.lesson13;

//Составить программу вычисления значений функции f(x) из задачи 1 для n
//значений аргумента x, равномерно распределенных на отрезке [a, b]. Для
//проверки программы задать n = 10; a = 0.50; b = 1.00. Результаты выдать в виде
//таблицы, в каждой строке порядковый номер, значение аргумента и значение
//функции с шестью знаками после запятой.

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a;
		double b;
		double h;
		double y;

		a = 0.5;
		b = 1.0;
		h = (b - a) / 9;
		
		System.out.println(h );

		System.out.println("----------------------------");
		System.out.printf("| %2s | %8s | %8s |\n", "#", "x", "y");
		System.out.println("----------------------------");

		int counter = 1;

		for (double i = a; i <= b + 0.001; i = i + h) {

			y = Math.sqrt((Math.pow(Math.E, 2.2 * 0.5)))

					- Math.abs(Math.sin((Math.PI * i) / (i + (2.0 / 3.0))))

					+ 1.7;

			System.out.printf("| %2s | %6f | %6f |\n", counter, i, y);

			counter++;
		}
		System.out.println("----------------------------");

	}

}
