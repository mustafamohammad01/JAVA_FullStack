package ConstructorTypes;

public class NoArgsConstructor {
	String name;

	  // public constructor
	 public NoArgsConstructor() {
		
	{
	    name = "MOHAMMAD MUSTAFA";
	  }
	}
}

class Main {
	  public static void main(String[] args) {
		  NoArgsConstructor obj = new NoArgsConstructor();
	      System.out.println("My name = " + obj.name);
	  }
}
