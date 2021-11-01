package Day3;

import java.util.Scanner;

public class PerimeterOfRhombus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Side of Rhombus:");
		float length = sc.nextFloat();
		
		
		double perimeter = 4*length;
		System.out.println("Perimeter of Rhombus is "+Math.round(perimeter*100)/100.0);

}

}
