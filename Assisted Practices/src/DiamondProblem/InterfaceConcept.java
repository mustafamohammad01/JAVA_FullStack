package DiamondProblem;

public interface InterfaceConcept {
	 public void connectServer();
}

class InterfaceConcept1 {
	public void responsive(String str) {
		    System.out.println("In "+str + " By using interface Concept we can solve Diamond problem.");
	 }
}
class Concept extends InterfaceConcept1 implements InterfaceConcept {

		  String language = "JAVA";
		  public void connectServer() {
		    System.out.println(language + " is Known as Platform Independent Programming Language.");
		  }

		  public static void main(String[] args) {
		    Concept obj  = new Concept();

		    obj.connectServer();
		    obj.responsive(obj.language);
		  }

}
