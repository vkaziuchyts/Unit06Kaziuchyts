package lt.lhu.unit06.main;

import java.util.Random;

public class Task04Lesson07 {

	public static void main(String[] args) {
		/*Задается n точек на плоскости. Записать логическое выражение*/
		boolean inRegion;
		
		int x1 = -2, y1 = 0;
		int x2 = 0, y2 = 2;
		int x3 = 0, y3 = -1;
		int x4 = 2, y4 = 1;
		
		double x = 0.15, y = -0.2;
		
		int n = 2000;
		Random rand = new Random();
		
		int sum = 0;
		int i = 0;
		while (i <n) {
			x = rand.nextDouble(-5,5);
			y = rand.nextDouble(-5,5);
			
			inRegion = ((x >= x1 && x <= x2) && (y >= y1 && y <= y2)) || ((x >= x3 && x <= x4) && (y >= y3 && y <= y4));
			if (inRegion) {
				System.out.printf("---Точка (%.2f, %.2f) попадает в регион\n", x, y);
				sum++;
			} else {
				System.out.printf("Точка (%.2f, %.2f) не попадает в регион\n", x, y);
			}
			i++;
		}
		
		System.out.println("Количество точек, попавших в регион: " + sum);
	}

}
