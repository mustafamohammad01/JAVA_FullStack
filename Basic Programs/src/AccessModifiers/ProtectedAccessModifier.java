package AccessModifiers;

public class ProtectedAccessModifier {
	 protected void display() {
	        System.out.println("Hello i am Mohammad Mustafa");
	 }
}

class Protectedexample extends ProtectedAccessModifier {
	    public static void main(String[] args) {
	       Protectedexample obj = new Protectedexample();
	        obj.display();
	    }
}
