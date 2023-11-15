package autoboxing;

public class AutoboxDemo {

	public static void main(String[] args) {
		
		int number = 10;
		System.out.println("Primitive number: "+number);
		
//		autoboxing
		Integer object = Integer.valueOf(number);
		System.out.println("Object of primitive number(Autoboxing): "+object);
		
//		unboxing
		int n = object;
		System.out.println("(Unboxing): "+n);
		
		char c = 'a';
		
		Character obj = Character.valueOf(c);
		System.out.println(obj);

	}
}
