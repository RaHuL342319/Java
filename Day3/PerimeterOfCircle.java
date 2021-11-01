package Day3;

import java.util.Scanner;

public class PerimeterOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius of Circle:");
		float radius = sc.nextFloat();

		double perimeter = 2* Math.PI * radius;
		System.out.println("Perimeter of Circle is "+Math.round(perimeter*100)/100.0);

	}

}
