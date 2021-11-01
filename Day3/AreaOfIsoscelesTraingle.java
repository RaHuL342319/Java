package Day3;

import java.util.Scanner;

public class AreaOfIsoscelesTraingle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter height of Isosceles Traingle:");
		float height = sc.nextFloat();
		System.out.print("Enter base of Isosceles Traingle:");
		float base = sc.nextFloat();
		double area = 0.5 * height * base;
		System.out.println("Area of Isosceles Traingle is "+Math.round(area*100)/100.0);
	}

}
