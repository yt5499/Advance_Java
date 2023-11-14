package synchronization;

public class MathWork {
	synchronized void getMultiples(int n) {
		//		synchronized (this) {
		for(int i=1 ; i<=5 ; i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println("Exception raised: "+e);
			}
		}
		//		}
	}
}
