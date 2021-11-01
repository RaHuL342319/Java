package Day3;

import java.util.Scanner;

public class VolumeOfPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter Base length of Pyramid:");
		float baselength = sc.nextFloat();
		
		System.out.print("Enter Base width of Pyramid:");
		float basewidth = sc.nextFloat();
		
		System.out.print("Enter height of Pyramid:");
		float height = sc.nextFloat();
		
		
		double volume = (baselength * basewidth * height)/3;
		System.out.println("Volume of Prism is "+Math.round(volume*100)/100.0);

}

}
