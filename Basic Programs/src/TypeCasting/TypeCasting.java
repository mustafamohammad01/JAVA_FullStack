package TypeCasting;
import java.util.Scanner;
public class TypeCasting {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("This is a Implicit Typecasting");
	    System.out.println("Enter a Number:");
	    int num=sc.nextInt();
	    System.out.println("The integer value: " + num);
	    //Implicit typecasting
	    double data = num;
	    System.out.println("The double value: " + data);
	    System.out.println("This is a Explicit Typecasting");
	    System.out.println("Enter a Number:");
	    double num1 = sc.nextDouble();
	    //Explicit typecasting
	    int data1 = (int)num1;
	    System.out.println("The integer value: " + data1);	    
	  }
}
