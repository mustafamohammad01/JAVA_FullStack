package EmailValidator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailValidation {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a email id:");
		String email=sc.next();
		System.out.println("Email1 is "+emailValidation(email));	
}
public static boolean emailValidation(String email) {
		String emailRegex= "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern pattern=Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher(email);
		return matcher.find();	
	}
}
