package Day3;

import java.util.Scanner;

public class VolumeOfSphere {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter Radius of Sphere:");
		float radius = sc.nextFloat();
		
		
		double volume = 4/3.0 *Math.PI * radius * radius * radius;
		System.out.println("Volume of Sphere is "+Math.round(volume*100)/100.0);

}

}
