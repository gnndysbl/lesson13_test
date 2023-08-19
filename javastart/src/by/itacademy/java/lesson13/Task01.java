package by.itacademy.java.lesson13;

//Написать приведенную формулу по правилам языка программирования.

public class Task01 {

	public static void main(String[] args) {

		double x = 0.5;

		double result =

				Math.sqrt((Math.pow(Math.E, 2.2 * 0.5)))

				- Math.abs(Math.sin((Math.PI * x) / (x + (2.0 / 3.0)))) 

				+ 1.7;

		System.out.println(result);

	}

}
