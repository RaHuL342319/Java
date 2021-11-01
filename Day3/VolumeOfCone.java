package Day3;

import java.util.Scanner;

public class VolumeOfCone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter height of Cone:");
		float height = sc.nextFloat();
		
		System.out.print("Enter Radius of Cone:");
		float radius = sc.nextFloat();
		
		
		double perimeter = Math.PI * radius * radius * (height/3);
		System.out.println("Volume of Cone is "+Math.round(perimeter*100)/100.0);

}

}
