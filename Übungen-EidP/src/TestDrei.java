/**
 *  Sören Seeger
 *  Test3 Berrendorf
 */

import java.util.Scanner;

public class TestDrei {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System. in ); 
		
		int first = sc.nextInt();
		int anzahl = 0;
		
		
		while(sc.hasNextInt()) {
			
			int other = sc.nextInt(); 
			if (other == first) {
				anzahl++;
			}
			
		}

		System.out.println("Anzahl an weiteren " + first+ "en :" + " " + anzahl);
		sc.close();
	}
	
	
	

}
