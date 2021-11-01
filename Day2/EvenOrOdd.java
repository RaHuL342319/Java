
//Write a program to print whether a number is even or odd, also take input.
package Day2;
import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int number = sc.nextInt();
		
		if(number % 2 == 0) 
			System.out.println(number+" is Even number");
		System.out.println(number+" is Odd number");
	}

}
