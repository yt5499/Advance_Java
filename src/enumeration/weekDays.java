package enumeration;

public enum weekDays {
	
	monday("first working day"),
	tuesday("second working day"),
	wednesday("third working day"),
	thursday("fourth working day"),
	friday("fifth working day"),
	saturday("a day before holiday"),
	sunday("congrats! holiday");
	
	private String val;
	
	private weekDays(String val) {
		this.val = val;
	}

	public String getVal() {
		return val;
	}

}
