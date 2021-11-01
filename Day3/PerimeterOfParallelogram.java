package Day3;

import java.util.Scanner;

public class PerimeterOfParallelogram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Side of Parallelogram:");
		float side = sc.nextFloat();
		System.out.print("Enter base of Parallelogram:");
		float base = sc.nextFloat();

		double perimeter = 2*(base + side);
		System.out.println("Perimeter of Parallelogram is "+Math.round(perimeter*100)/100.0);

	}

}
