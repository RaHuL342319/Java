package Day3;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of Rectangle:");
		float length = sc.nextFloat();
		System.out.print("Enter width of Rectangle:");
		float width = sc.nextFloat();
		double area = length * width;
		System.out.println("Area of Circle is "+Math.round(area*100)/100.0);
	}

}
