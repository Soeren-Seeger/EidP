import java.util.Scanner;

public class BoolExpression {

	public static void main(String[] args) {
	boolean wert1 = false;
	boolean wert2 = true;
	
	System.out.println(!wert1 & ( wert1 | wert2));
	wert1 = true;
	System.out.println(!wert1 & ( wert1 | wert2));
	
	Scanner sc  = new Scanner(System.in);
	
	int st;
	byte st2;
	
	st =  sc.nextInt();
	st2 =  sc.nextByte();
	System.out.println(st + " " + st2);
	}

}
