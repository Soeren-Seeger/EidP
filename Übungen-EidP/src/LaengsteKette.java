import java.util.Scanner;

public class LaengsteKette {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner ( System . in );
		int pre = -1;
		int longestChain = 1;
		int actualChain = 1;		// anzahl der mom Verglichenen gleichen Werte

		
		while(sc.hasNextInt()) {
			
			int i = sc.nextInt(); 
				
			
			if (i == pre) {
					actualChain ++;
					if (actualChain > longestChain) {
						longestChain = actualChain; //wenn neuer Highscore --> Speichern
					}
				}

			
			else {
				actualChain = 1; // Wenn Kette unterbrochen --> Zähler zurücksetzen
			}
			
			pre = i;
		}
		
		System.out.println(longestChain);
		sc.close();
	}

}
