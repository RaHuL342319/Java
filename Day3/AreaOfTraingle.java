package Day3;

import java.util.Scanner;

public class AreaOfTraingle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter height of Traingle:");
		float height = sc.nextFloat();
		System.out.print("Enter base of Traingle:");
		float base = sc.nextFloat();
		double area = 0.5 * height * base;
		System.out.println("Area of Circle is "+Math.round(area*100)/100.0);
	}

}
