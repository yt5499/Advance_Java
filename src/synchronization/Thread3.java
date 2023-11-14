package synchronization;

public class Thread3 implements Runnable{
	MathWork mw;

	public Thread3(MathWork mw) {
//		super();
		this.mw = mw;
	}

	@Override
	public void run() {
		try {
			mw.getMultiples(3);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	
}
