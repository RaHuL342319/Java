package Day3;

import java.util.Scanner;

public class PerimeterOfSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length of Square:");
		float length = sc.nextFloat();
		
		
		double perimeter = 4*length;
		System.out.println("Perimeter of Rectangle is "+Math.round(perimeter*100)/100.0);

}

}
