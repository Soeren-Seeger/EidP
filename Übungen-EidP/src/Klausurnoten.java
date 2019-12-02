/**
 * Ü8A5
 * Verwalten von Klausurnoten
 * @author Sören Seeger
 */
public class Klausurnoten {

//	public static void main (String[] args) {
//		int[] punkte = {1,1,2,3,4,4,5,10};
//		int[] punktGrenzen = {0,1,1,1};
//		verarbeiteKlausurPunktzahl(punkte, punktGrenzen);
//	}
//	
	
	public static void verarbeiteKlausurPunktzahl ( int [] punkte , int [] punktGrenzen ) {
		     
		System.out.println(punkte.length);
		
		int min = punkte[0];
		int max = punkte[0];
		for (int i = 0; i < punkte.length; i++) {
			if (punkte[i] < min)
				min = punkte[i];
			if (punkte[i] > max)
				max = punkte[i];
		}
		System.out.print(p2n(max, punktGrenzen) + " ");
		System.out.println(p2n(min, punktGrenzen));
		
		int bestanden = 0;
		int durchgefallen = 0;
		for (int i = 0; i < punkte.length; i++) {
			if(check(punkte[i], punktGrenzen)) {
				bestanden++;
			}else {
				durchgefallen++;
			}
		}

		System.out.print(bestanden + " ");
		System.out.println(durchgefallen);
		System.out.println(durchschnitt(punkte, punktGrenzen));
		histogramm(punkte, punktGrenzen);
	}
	
	public static int p2n (int punkte, int[] pG) {
		int note = 1;
		for (int i = pG.length-1; i >= 0; i--) {	
		if (punkte > pG[i]) {
			return note;
		}
		note++;		
		}	
		return 5;
	}
	
	public static boolean check (int punkte, int[] pG) {
		
		if (punkte > pG[0])
			return true;
		return false;
	}
	
	public static double durchschnitt (int[] punkte, int[] pG) {
		double sum = 0;
		for (int i = 0; i < punkte.length; i++) {
			sum += punkte[i];
		}
		return (sum/ punkte.length);
	}
	
	public static void histogramm (int[] punkte, int[] pG) {
		int[] anzahl = new int [6]; //beutzter index beginnt bei 1
		for (int i = 0; i < punkte.length; i++) {
			anzahl[p2n(punkte[i], pG)] ++;
		}
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " " + anzahl[i]);
		}
	}	
}
