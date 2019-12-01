import java.util.Scanner;

public class Caesar {

	public static void main(String[] args) {
		int key = 0;
		char code;
		Scanner s = new Scanner(System.in);
		
		key = (s.nextInt() % 26);
		
		code = s.next().toUpperCase().charAt(0);
		
		code = (char) ((int)code + key);
		if (code > 'Z') {
			code = (char)((int)code - 26);
		}
		System.out.println(code);
		s.close();
	}
}
