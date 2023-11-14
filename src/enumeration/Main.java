package enumeration;

public class Main {

	public static void main(String[] args) {
		
			weekDays w1 = weekDays.wednesday;
			
			System.out.println("Enum name: "+w1.name());
			System.out.println("Enum value: "+w1.getVal());
			
			System.out.println();
			
			for(weekDays wd : weekDays.values()) {
				System.out.println("Enum name: "+wd.name()+" and Enum value: "+wd.getVal());
			}

	}

}
