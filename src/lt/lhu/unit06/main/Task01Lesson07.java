package lt.lhu.unit06.main;

public class Task01Lesson07 {

	public static void main(String[] args) {
		double x = 0.5;
		double rez;
		
		rez = Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin(Math.PI * x / (x + 2.0 / 3.0))) + 1.7;
		
		System.out.println("x = " + x);
		System.out.println("rez = " + rez);

	}

}
