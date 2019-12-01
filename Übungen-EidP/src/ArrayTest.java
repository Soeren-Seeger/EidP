
public class ArrayTest {

	public static void main(String[] args) {
		String a = "abc";
		String b = ""+"abc";
		String c = "" + b;
		String d = b;
		
		if (a == b)
			System.out.println("Ref gleich");
				
			
		
		if (a == c)
			System.out.println("Ref gleich 2");
		
		if (a == d)
			System.out.println("Ref gleich 3");
				

	}

}
