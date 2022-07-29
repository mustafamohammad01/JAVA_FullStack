package MultiThreading;
import java.util.Scanner;
public class ExceptionHandling extends Exception {
		String message;
	    public ExceptionHandling(String message) {
	        this.message = message.toString();
	    }
	}

	class BankAccount  {

	   static double current_balance = 1000;

	    public static void main(String[] args) throws ExceptionHandling {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter amount to withdrawal");
	        int withdrawl = sc.nextInt();
	        try {
	            if (current_balance < withdrawl) {
	                throw new ExceptionHandling("Insufficient balancew ! your Current balance is " + current_balance);
	            } else {
	                System.out.println("Withdrawl Successfully done,take out ur cash: " +withdrawl);
	                System.out.println("The remaining Balance is:"+(current_balance-withdrawl));
	            }

	        } catch (ExceptionHandling e) {
	        	e.printStackTrace();
	          }
	    }
	}

