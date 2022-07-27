package Collections;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLinkedListExample {
public static void main(String[] args) {
		LinkedList<String> list =new LinkedList<>();
		ArrayList<String> list1=new ArrayList<>();
		list.add("Mustafa");
		list.add("Mohammad");
		list.add(null);
		list.add("Khader");
		list1.add("Imran");
		list1.add("Sameer");
		list1.add(null);
		list1.add("Abdul");
		System.out.println("ArrayList Elements:" + list1);
		System.out.println("LinkedList Elements:" + list);
		
		if(list.contains("Khader"))
			System.out.println("found="+list.indexOf("Khader"));
		else
			System.out.println("not found");
		if(list1.contains("Imran"))
			System.out.println("found="+list1.indexOf("Imran"));
		else
			System.out.println("not found");
		
		list.remove("Mohammad");
		list1.remove("Sameer");
		System.out.println(list);
		System.out.println(list1);
		System.out.println(list.get(2));
		System.out.println(list1.get(2));
		
	}
}
