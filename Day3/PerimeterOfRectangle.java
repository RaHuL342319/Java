package Day3;

import java.util.Scanner;

public class PerimeterOfRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length of Rectangle:");
		float length = sc.nextFloat();
		System.out.print("Enter Width of Rectangle:");
		float width = sc.nextFloat();
		
		double perimeter = 2*(length + width);
		System.out.println("Perimeter of Rectangle is "+Math.round(perimeter*100)/100.0);

}

}
