package lt.lhu.unit06.main;

public class Task02Lesson07 {

	public static void main(String[] args) {
		double a = 0.50;
		double b = 1;
		double n = 10;
		double h = (b - a) / n;
		double rez;

		System.out.println(" ------------------------");
		System.out.println("|      x   |     rez   |");
		
		for (double x = a, i = 1; x <= b; x += h, i++) {
			rez = Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin(Math.PI * x / (x + 2.0 / 3.0))) + 1.7;
			
			System.out.println(" ------------------------");
			System.out.printf("|%2d-|%-6.3f|%-11f|\n", (int)i, x, rez);
		}
		
		System.out.println(" ------------------------");

	}

}
