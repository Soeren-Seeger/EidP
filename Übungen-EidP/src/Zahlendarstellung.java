import java.util.Arrays;

public class Zahlendarstellung {

//	public static void main(String[] args) {
//		System.out.println(Arrays.toString(ermittleZiffern(1234,16)));
//
//	}
	
	
	
	public static int[] ermittleZiffern(int x, int b) {
		if (x==0) {				//Abfrage ob 0
			int[] a = {0};
			return (a);
		}
		
		int anzahl = 0;				//Länge Array ermitteln
		int probe = x;
		while (probe !=0) {
			probe = probe/b;
			anzahl++;
		}
		
		int[] erg = new int[anzahl];		//Array anlegen
		for (int i = 0; i < anzahl; i++) {		//Werte berrechnen 
			erg[i] = x%b;
			x = x/b;
		}
		return erg;
	}

}
