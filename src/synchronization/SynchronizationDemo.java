package synchronization;

import concurrencyANDthread.Thread2;

public class SynchronizationDemo {

	public static void main(String[] args) {
		
		MathWork obj = new MathWork();
		
		Thread1 t1 = new Thread1(obj);
		Thread t2 = new Thread(new Thread3(obj));
		
		t1.start();
		t2.start();

	}

}
