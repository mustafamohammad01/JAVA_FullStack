package BasicCalculator;

import java.util.Scanner;

public class BasicCalculator {
	 public static void main(String[] args) {
		    Double number1, number2, result;
		    Scanner input = new Scanner(System.in);
		    System.out.println("Enter first number");
		    number1 = input.nextDouble();
		    System.out.println("Enter second number");
		    number2 = input.nextDouble();
		    while(true) {
		    System.out.println("Enter 1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Mod 6.Exit ");
		    int choice=input.nextInt();
		    switch (choice) {
		      case 1:
		        result = number1 + number2;
		        System.out.println("The Sum is:" + result);
		        break;
		      case 2:
		        result = number1 - number2;
		        System.out.println("The Subtraction is:"+ result);
		        break;
		      case 3:
		        result = number1 * number2;
		        System.out.println("The Multiplication is:" + result);
		        break;
		      case 4:
		        result = number1 / number2;
		        System.out.println("The Division is:"+ result);
		        break;
		      case 5:
			        result = number1 % number2;
			        System.out.println("The Mod is:"+ result);
		        break;
		      case 6:
		        System.exit(0);
		        break;
		    }

		  }
		  }
}
