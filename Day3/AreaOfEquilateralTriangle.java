package Day3;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter side of Equilateral Traingle:");
		float side = sc.nextFloat();

		double area = Math.sqrt(3)/4 * side * side;
		System.out.println("Area of Equilateral Traingle is "+Math.round(area*100)/100.0);
	}

}
