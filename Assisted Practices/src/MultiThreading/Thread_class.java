package MultiThreading;

public class Thread_class extends Thread {
	private int marks;
	public Thread_class(int marks){
		this.marks=marks;
	}
	synchronized public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i*marks);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

}
class driverclass{
	public static void main(String args[]) {
		Thread_class obj=new Thread_class(20);		
		Thread_class obj1=new Thread_class(10);
		obj1.start();
		obj1.start();
}
}
