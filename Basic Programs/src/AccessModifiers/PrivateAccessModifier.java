package AccessModifiers;

public class PrivateAccessModifier {
	private String name;
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name= name;
    }
}
class Main2 {
    public static void main(String[] main){
    	PrivateAccessModifier obj = new PrivateAccessModifier();
        obj.setName("Hello this is Mohammad Mustafa ");
        System.out.println(obj.getName());
    }

}
