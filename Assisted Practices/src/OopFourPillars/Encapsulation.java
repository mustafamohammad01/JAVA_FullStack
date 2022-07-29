package OopFourPillars;

public class Encapsulation {
	static int length;
	static int breadth;
	Encapsulation(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public static void getArea() {
		int area = length * breadth;
		System.out.println("Area: " + area);
	}
	}

	class Main {
	public static void main(String[] args) {

		Encapsulation rectangle = new Encapsulation(2, 16);
		Encapsulation.getArea();
	}
	}
