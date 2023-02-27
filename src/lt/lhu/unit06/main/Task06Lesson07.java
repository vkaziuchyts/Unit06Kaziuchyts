package lt.lhu.unit06.main;

public class Task06Lesson07 {

	public static void main(String[] args) {
		/*Целочисленная функция f(K) = K в 3 - 25 K в 2 +50K+1000 определена только для целых значений аргумента K*/
		boolean U;
		
		double a = 3 * (Math.pow(10, 3));
		double b = 6 * (Math.pow(10, 4));
		double m = 4;
		
	    int n = 20;
	    int h = (60 - (-30)) / n;
	    
	    double T1 = Math.sqrt(a + b + m);
	    double T2 = m * (Math.sqrt(a + b));
	    double T3 = Math.sqrt(a * b * m);
	    double T4 = m * (Math.sqrt(a * b));
	    double y;
	    
	    int sum = 0;
	    int count = 1;
	    for (int k = -30; k < 60; k = k + h) {
	        y = (Math.pow(k, 3)) - 25 * (Math.pow(k, 2)) + 50 * k + 1000;
	        U = (y >= T1 && y <= T2) || (y >= T3 && y <= T4);
	        if (U) {
	            if (y%1 == 0) {
	                System.out.println("Значение " + (long)y + " соответствует условию.");
	            }
	        } else {
	            sum++;
	        }
	        if (count ==20) {
	            break;
	        }
	        count++;
	    }

	    System.out.println("Количество значений, не соответствующих условию: " + sum);
	    }
	}