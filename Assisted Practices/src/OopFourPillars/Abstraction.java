package OopFourPillars;

abstract public class Abstraction {
		  abstract void makeSound();

		  public void eat() {
		    System.out.println("I can eat.");
		  }
		}

class Dog extends Abstraction {
		  public void makeSound() {
		    System.out.println("Bark bark");
		  }
		}

class Maindriver {
		  public static void main(String[] args) {
		    Dog d1 = new Dog();
		    d1.makeSound();
		    d1.eat();
		  }
}
