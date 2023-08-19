package by.itacademy.java.lesson13;

public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x = 0.1;
		double n = 10 / 0.1;
		double y;
		int counter = 1;

		System.out.printf("\n" + "[ %2s ] [ %3s] [%6s]", "#", "x", "y");
		
		for (int i = 1; i <= n; i++) {

			y = Math.pow(x, 2) - Math.pow(Math.E, 2.0 * x) + 4;

			System.out.printf("\n" + "[ %2d ] [ %3.1f] [%6.3f]", counter, x, y);
			counter++;
			x = x + 0.1;
			
			if ( y < 0) {
				break;
			}

		}
	}

}
