package Day2;
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount or principal:");
	    float principal = sc.nextFloat();
	    System.out.print("Enter Rate:");
	    float rate = sc.nextFloat();
	    System.out.print("Enter time for interest:");
	    int time = sc.nextInt();
	    
		
		double simpleInterest = (principal * rate * time)/100;
		System.out.println("simple interest is "+simpleInterest);
		
	}
}
