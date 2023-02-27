package lt.lhu.unit06.main;

public class Task07Lesson07 {

	public static void main(String[] args) {
		/* вычисления таблицы значений заданной функции для N значений X, меняющихся от Xнач c заданных шагом HX, и M зачений для Z, меняющихся от Zнач с шагом HZ*/
		double x;
		double hx = 1;
		
		double z;
		double hz = 1;
		
		double n = 20;
		double m = 22;
		
		x = 3;
		z = 1;
		
		int c = 1;		
		double y;
		
		for (int i = 1; i <= n; i++) {
			y = (Math.sqrt(z * z + x *x) * Math.log(z)) + ((Math.abs(Math.log(z))) / (Math.sqrt(Math.pow(x, 2) - Math.pow(z, 2)) + 3.2));
			System.out.printf("|%6.2f, |%6.2f, |%10.6f|\n", x, z, y);
			if (c <= m) {
				z = z + hz;
				c++;
			} else {
				break;
			}
			x = x + hx;
		
			
		}
	        
	}

}
