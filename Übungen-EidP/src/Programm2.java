/**
 * GgT-Berrechnung
 * @author Sören Seeger
 */




import java.util.Scanner;

public class Programm2 {


	public static void main(String[] args) {
		System.out.println("Berechnung des größten gemeinsamen Teilers.");
		Programm2 test = new Programm2();
		System.out.println(test.iterativ(test.askx(), test.asky()));
		
		}
		
	
	
	public int iterativ (int xi, int yi) {
		//System.out.println("Debug:" +x);
		//System.out.println("Debug:" +y);
	int x = xi;
	int y = yi;
	
	
		if (x == 0) {
			System.out.println("Der GGT ist:");
			return y;
		}else {
			while (y != 0) {
				if (x > y) {
					x = x-y;
				}else {
					y = y-x;
				}
			

			}
			System.out.println("Der GGT ist:");
			return x;

		}
		
	}
	public int askx () {
		Scanner input1 = new Scanner(System.in);
		System.out.println("Erste Zahl bitte eingeben: ");
		return Integer.parseInt(input1.nextLine());
	}
	public int asky () {
		Scanner input2 = new Scanner(System.in);
		System.out.println("Zweite Zahl bitte eingeben: ");
		return Integer.parseInt(input2.nextLine());
	}



}
