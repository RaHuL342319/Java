package Day3;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of Cylinder:");
		float radius = sc.nextFloat();
		System.out.print("Enter height of Cylinder:");
		float height = sc.nextFloat();
		double curvedarea = 2*Math.PI * height * radius;
		System.out.println("Area of Circle is "+Math.round(curvedarea*100)/100.0);
	}


}
