package Day3;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter side of Cube:");
		float side = sc.nextFloat();
		
		double totalSurfaceArea = 6*side*side;
		System.out.println("Area of Rhombus is "+Math.round(totalSurfaceArea*100)/100.0);
	}

}
