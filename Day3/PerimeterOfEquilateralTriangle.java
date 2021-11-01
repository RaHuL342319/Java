package Day3;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Side of Traingle:");
		float side = sc.nextFloat();

		double perimeter = 3* side;
		System.out.println("Perimeter of Equilateral Triangleis "+Math.round(perimeter*100)/100.0);

	}

}
