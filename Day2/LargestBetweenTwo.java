package Day2;

import java.util.Scanner;

public class LargestBetweenTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First number:");
	    int num1 = sc.nextInt();
	    System.out.print("Enter Second Number:");
	    int num2 = sc.nextInt();
	    
	    if(num1 > num2)
	    	System.out.println(num1+" is Largest.");
	    else if(num2 > num1)
	    	System.out.println(num2+" is Largest.");
	    System.out.println(num1+" is equal to "+num2);
	}

}
