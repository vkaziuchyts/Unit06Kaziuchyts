package lt.lhu.unit06.main;

public class Task03Lesson07 {

	public static void main(String[] args) {
		double x = 0.5;
		double n = 20.0;
		double rez;
		
		double sum = 0;
		for(double k = 1; k <= n; k++) {
			sum = sum + (((Math.sin(k * x / 2.0) + (Math.sin((k * x - 1)/ 2.0))) / Math.pow(Math.E, x - (1 / k))));
		}
		
		rez = (Math.sqrt(n * Math.PI)) * sum;
		System.out.println("rez = " + rez);
		
	}

}
