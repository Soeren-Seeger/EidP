
public class Studierender {

	public String vorname;
	public String nachname;
	public int matrikelnummer;
	public float[] noten = new float[500];
	public int anzNoten = 0;
	public float notenschnitt = 0;
	
	public Studierender(String vorname, String nachname, int matrikelnummer) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.matrikelnummer = matrikelnummer;
	}
	
	public void neueNote(float note) {
		noten[anzNoten]= note;
		anzNoten++;
		
		if (notenschnitt == 0) {
			notenschnitt = note;
		}else {
			notenschnitt = ((notenschnitt*(anzNoten-1)) + note)/anzNoten;
		}
			
		
	
	}
	
	
	public float getNotendurchschnitt() {
		return notenschnitt;
	}
	
	public String toString() {
		String alleErg = "";
		for(int i = 0; i< anzNoten; i++) {
			alleErg = (alleErg + noten[i] + " ") ;
			
		}
		return ("Name: " + vorname + " " + nachname + "  Matr.Nr: " + matrikelnummer + "  Ergebnisse: " + alleErg + "  Notendurchschnitt: " + notenschnitt);
	}
	
}
