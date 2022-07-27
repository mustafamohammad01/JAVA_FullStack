package ConstructorTypes;

public class ParameterizedConstructor {
	String friends;
	  public ParameterizedConstructor(String frnds) {
		  {
		   friends = frnds;
	       System.out.println(friends + " is my Best friend");
	  }
}

	  public static void main(String[] args) {

	    // call constructor by passing a single value
		  ParameterizedConstructor obj1 = new ParameterizedConstructor("Munni");
		  ParameterizedConstructor obj2 = new ParameterizedConstructor("Gayathri");
		  ParameterizedConstructor obj3 = new ParameterizedConstructor("Satish");
		  ParameterizedConstructor obj4 = new ParameterizedConstructor("Chaitu");
		  ParameterizedConstructor obj5 = new ParameterizedConstructor("Pavan");
		  ParameterizedConstructor obj6 = new ParameterizedConstructor("Jayanth");
		  ParameterizedConstructor obj7 = new ParameterizedConstructor("Sindhu");
	  }
}
