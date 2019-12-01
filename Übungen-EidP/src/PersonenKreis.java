/**
 * Übung 4
 * @author soeren-seeger 
 *
 *index, position und weitere Zähler beziehen sich auf die n-te Person (nicht die Stelle im Array)
 */

public class PersonenKreis {

	public static void main(String[] args) {
		int n = 5000; 				//Anzahl Personen
		
		boolean[] vorhanden = new boolean[n];
		vorhanden = füllen(vorhanden);		// Array mit true Füllen
		
		
		int index = 0; //Index des zu löschenden
		
		System.out.println("n = " + n);

		
		while (check(vorhanden) > 2) {		//solange es mehr als 2 Personen gibt
			index = ermitteln(vorhanden, index);	//Index des nächsten zu löschenden Elemetes bestimmen
			vorhanden[index-1] = false;	//Voherig bestimmt. Index false setzten
			//System.out.println(Arrays.toString(vorhanden));
			
		}
		
		int person = 1;  //nur für Angabe von Person  und 2 in der Ausgabe
		for (int i = 0; i < vorhanden.length ; i++) { // Feld durchgehen und nach den beiden true suchen
			if (vorhanden[i] == true) {
				System.out.println("Person" + person+ " :" + (i+1));
				person = person +1;
			}
			
		}
		

	}
	
	public static boolean[] füllen (boolean[] v) {
		
		for (int i = 0; i < v.length; i++) {
			v[i] = true;
		}
		return v;
	}
	
	public static int check (boolean[] v) {    // nur noch 2 Personen ?
		int anz = 0;
		
		for (int i = 0; i < v.length; i++) {
			if (v[i]) 
				anz++;
		}
		return anz;
	}
	

	
public static int  ermitteln (boolean[] v, int index) {    
		int schritte = 3; //3 benötigte tatsächliche Schritte gehen (runterzählen)
		int position = index; //Position im Array (Init. mit dem vorherig gelöschten)

		while (schritte > 0) { // Weitergehen (insg. 3 tatsächliche Schritte)
			
			if (position == v.length) { //Überlauf verhindern
				position = 0;
			}
			if (v[position-1+1] == true) {	// Wenn Person +1 noch im Spiel -> Den Schritt weitergehen
				schritte = schritte - 1;
				position = position +1;				
			}else {
				position = position +1;
			}	
		}
		//letzter Schritt
		return position;
	}

}
