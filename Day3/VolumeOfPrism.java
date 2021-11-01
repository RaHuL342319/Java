package Day3;

import java.util.Scanner;

public class VolumeOfPrism {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Base Area of Prism:");
		float base_area = sc.nextFloat();
		
		System.out.print("Enter Height of Prism:");
		float height = sc.nextFloat();
		
		
		double volume = base_area * height;
		System.out.println("Volume of Prism is "+Math.round(volume*100)/100.0);

}

}
