package MultiThreading;

public class SynchronizationExample {
	synchronized void table(int n) throws InterruptedException{
		for(int i=1;i<=5;i++) {
			System.out.println("The square of number is "+(n*i));
			Thread.sleep(3000);
		}
	}
}
class threadexample extends Thread{
	SynchronizationExample  t;
	threadexample(SynchronizationExample t) {
		this.t=t;
	}
	public void run() {
		try {
			t.table(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class threadexample1 extends Thread{
	SynchronizationExample  t;
	threadexample1(SynchronizationExample t) {
		this.t=t;
	}
	public void run() {
		try {
			t.table(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class DriverMain{
	public static void main(String args[]) {
		SynchronizationExample obj=new SynchronizationExample();
		threadexample obj1=new threadexample(obj);
		threadexample1 obj2=new threadexample1(obj);
		obj1.start();
		obj2.start();
		
	}
}


