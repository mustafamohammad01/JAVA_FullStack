package InnerClass;

public class InnerClassExample {
 private String msg="Welcome to My World"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", This is Mohammad Mustafa");}  
	 }  


	public static void main(String[] args) {

		InnerClassExample obj=new InnerClassExample();
		InnerClassExample.Inner in=obj.new Inner();  
		in.hello();  
	}
}
