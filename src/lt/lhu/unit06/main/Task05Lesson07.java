package lt.lhu.unit06.main;

public class Task05Lesson07 {

	public static void main(String[] args) {
		/*вычисления N значений функции Y для X,изменяющегося от X1 с шагом dX. В качестве начальных значений выбрать A=1;X1=-2A; dX = A/5*/
		double x;
		double y;
		double n;
		
		double x1;
		double dx;
		
		double a;
		
		n = 20;
		
		a = 1;
		x1 = -2 * a;
		dx = a / 5.0;
		
		x = x1;
		for (int i = 0; i <= n; i++) {
			if(x <= 0 ) {
				y = a / 2.0 * (Math.pow(Math.E, x / a) + Math.pow(Math.E, -x / a));
			}else {
				y = 4 * Math.pow(a ,3) / (x * x + 4 * a * a);	
			}
			
			System.out.printf("(%5.2f, %10.6f)\n", x, y);
			x = x + dx;
		}
	}
}
