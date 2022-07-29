package MultiThreading;
public class waitMethod extends Thread {
	private int n;
	waitMethod(int n){
		this.n=n;
	}
	public void run() {
		for(n=2;n<10;n++) {
		System.out.println("the square number is:"+(n*n));
		try {
			Thread.sleep(2000);
			wait();
		} catch (InterruptedException e) {
		}
	}
	}
	
}
class Main{
	public static void main(String args[]) {
		waitMethod obj=new waitMethod(10);
		obj.start();
		
	}
}

