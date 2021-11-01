package Day2;
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;

public class OperationOnBasisOfOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First number:");
	    int num1 = sc.nextInt();
	    System.out.print("Enter Second Number:");
	    int num2 = sc.nextInt();
	    
	    System.out.print("Enter Operator(+,-,*,/,%):");
	    String operator = sc.next();
	    
	    if(operator.equals("+"))
	    	System.out.println(num1 + num2);
	    else if(operator.equals("-"))
	    	System.out.println(num1 - num2);
	    else if(operator.equals("*"))
	    	System.out.println(num1 * num2);
	    else if(operator.equals("/"))
	    	System.out.println(num1 / (num2*1.0));
	    else if(operator.equals("%"))
	    	System.out.println(num1 % num2);
	    
	    
	    
	}

}
