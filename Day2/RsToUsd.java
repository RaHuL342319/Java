package Day2;

import java.util.Scanner;

public class RsToUsd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rupees:");
	    int rs = sc.nextInt();
	    double usd = rs*0.013;
	    System.out.println(rs+" is equal to $" + usd);
	}
}
