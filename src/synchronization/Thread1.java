package synchronization;

public class Thread1 extends Thread{
	MathWork mw;

	public Thread1(MathWork mw) {
//		super();
		this.mw = mw;
	}
	
	@Override
	public void run() {
		try {
			mw.getMultiples(2);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
