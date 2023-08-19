package by.itacademy.java.lesson13;

// Составить программу для вычисления результат по формуле. В качестве
// входных параметров задать x = 0.5; n = 20;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double k = 1.0;
		double n = 20.0;
		double x = 0.5;
		double finalSum = 0d;
		double sum;

		for (double i = k; i <= n; i++) {

			sum = ((Math.sin((i * x) / 2.0)) +  Math.sin((i * x - 1.0) / 2.0))

					/ Math.pow(Math.E, x - (1.0 / i));

			
			finalSum = sum + finalSum;

//			System.out.println(sum);
//			System.out.println(finalSum);
//			System.out.println("--------------");

		}

		double result;

		result = (Math.sqrt(n * Math.PI)) * finalSum;

		System.out.println(result);
	}

}
