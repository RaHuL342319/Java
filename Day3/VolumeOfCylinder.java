package Day3;

import java.util.Scanner;

public class VolumeOfCylinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Height of Cylinder:");
		float height = sc.nextFloat();
		
		System.out.print("Enter Radius of Cylinder:");
		float radius = sc.nextFloat();
		
		
		double volume = Math.PI * radius * radius* height;
		System.out.println("Volume of Cylinder is "+Math.round(volume*100)/100.0);

}

}
