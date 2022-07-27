package AccessModifiers;

public class PublicAccessModifier {
	public  int Count;
    public  void display() {
        System.out.println("I am Mohammad Mustafa.");
        System.out.println("I have " + Count + " Mangos.");
    }
}

// Main.java
class Main3 {
    public static void main( String[] args ) {
    	PublicAccessModifier obj = new PublicAccessModifier();
    	obj.Count = 4;
    	obj.display();
    }
}
