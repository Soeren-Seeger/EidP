import java.util.Scanner;

public class DatumErweiterung {

    public static void main(String[] args) {
		int j, m, t, s, m1, m2;
		
		Scanner sc = new Scanner(System.in);
		
		//Einlesen der werte
		j = sc.nextInt();
		m = sc.nextInt();
		t = sc.nextInt();
		s = sc.nextInt();
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		
		sc.close();
		
		//i = verbleibenden Minuten zum draufaddieren
		for (int i = 0; i < m2; i++) {
			
			m1 ++;
			
			
			//Minuten Überlauf
			if(m1 == 60) {
				m1 = 0;
				s += 1;
			}
			
			
			// Stundenüberlauf
			if (s == 24) {
				s = 0;
				t+= 1;
			}
					
			
			//Fallunterscheidung 28,30,31-tägihe Monate (bei Tges-Überlauf hochzählen)
			if (m == 2) {
				if (t == 29) { //der erste Unzulässige Wert
					t = 1;		// ersetzen durch 1 und nächste höhere Stelle hochzählen (1. Tag des nä Monats)
					m += 1;
				}
			}
					
			else if (m == 4 || m == 6 || m == 9 || m == 11) {
				if (t == 31) {
					t = 1;
					m += 1;
				}
			}
					
			else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
				if (t == 32) {
					t = 1;
					m += 1;
				}
			} 
			
			
					
			// Monatsüberlauf		
			if (m == 13) {
				m = 1;
				j += 1;
			}
		
			
		
		}
		
		
		System.out.println(j + " " + m + " " +  t + " " +  s + " " +  m1);
		
		
	}

}
