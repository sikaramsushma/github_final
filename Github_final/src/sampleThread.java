import java.lang.*;

public class sampleThread implements Runnable {
	
	public static void main(String[] args) {
		Thread thre = new Thread(new sampleThread(), "SampleThread");
		System.out.println("test");
		System.out.println("test clone");

		thre.start();
		
	}

	@Override
	public void run() {
		System.out.println("Thread Name is" + Thread.currentThread());
		
	}
	}
