package InnerClass;

public abstract class AbstractInnerClass {
	 public abstract void display();
	   void show(){
		System.out.println("show method");   
	   }
	}


class innerClassAssisted3 {

	public static void main(String[] args) {
		AbstractInnerClass i = new AbstractInnerClass() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();
	   }
}
