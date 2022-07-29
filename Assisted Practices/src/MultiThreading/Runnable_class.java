package MultiThreading;

public class Runnable_class implements Runnable {
	private int marks;
	public Runnable_class(int marks){
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
class RunnableMultiThreading{
	public static void main(String args[]) {
		Thread Runnable_class=new Thread(new Runnable_class(20));		
		Runnable_class.start();
}
}
