package Day3;

import java.util.Scanner;

public class AreaofParallelogram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter height of Parallelogram:");
		float height = sc.nextFloat();
		System.out.print("Enter base of Parallelogram:");
		float base = sc.nextFloat();
		double area =  height * base;
		System.out.println("Area of Parallelogram is "+Math.round(area*100)/100.0);
	}

}
