package Day3;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a radius:");
		float radius = sc.nextFloat();
		double area = 2 * Math.PI * radius * radius;
		System.out.println("Area of Circle is "+Math.round(area*100)/100.0);
	}

}
