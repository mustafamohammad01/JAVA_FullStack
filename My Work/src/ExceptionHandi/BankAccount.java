package ExceptionHandi;

import java.util.Scanner;
class LessBalance extends Exception {
	String message;
    public LessBalance(String message) {
        this.message = message.toString();
    }
}

class BankAccount  {

   static double current_balance = 1000;

    public static void main(String[] args) throws LessBalance {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdrawal");
        int withdrawl = sc.nextInt();
        try {
            if (current_balance < withdrawl) {
                throw new LessBalance("Insufficient balancew ! your Current balance is " + current_balance);
            } else {
                System.out.println("Withdrawl Successfully done,take out ur cash: " +withdrawl);
                System.out.println("The remaining Balance is:"+(current_balance-withdrawl));
            }

        } catch (LessBalance e) {
        	e.printStackTrace();
          }
    }
}

