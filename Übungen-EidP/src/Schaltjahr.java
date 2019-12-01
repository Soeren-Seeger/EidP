import java.util.Scanner;

public class Schaltjahr {

	public static void main(String[] args) {
		
		int jahr = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Erste Zahl bitte eingeben: ");
		jahr = Integer.parseInt(input.nextLine());

		
		if (jahr % 4 == 0 && jahr < 1582) {
		System.out.println("Jahr "+ jahr + "ist Schaltjahr nach JUL");	
		}
		else if (jahr % 100 != 0 || jahr ==400) {
			System.out.println("Jahr "+ jahr + " ist Schaltjahr nach GREG");	
		}
		else {
			System.out.println("Jahr "+ jahr + "ist kein Schaltjahr");	
		}
	}

}
