package Day3;

import java.util.Scanner;

public class AreaOfRhombus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter diagonal of Rhombus:");
		float d1 = sc.nextFloat();
		System.out.print("Enter diagonal of Rhombus:");
		float d2 = sc.nextFloat();
		double area = d1 * d2;
		System.out.println("Area of Rhombus is "+Math.round(area*100)/100.0);
	}
}
