package kalender;

public class Jahr {
	
	int jahreszahl;
	Tag[] tage = new Tag[365];
	public int belegteTage = 0;
	
	public Jahr(int jahreszahl) {
		this.jahreszahl = jahreszahl;
		
		
		for(int i = 0; i < 365; i++) {
			tage[i] = new Tag();
		}
		
		
	}
	
	
	public void eintragen(int tag, String was, int prioritaet) {
		if(tage[tag-1].getVerabredung() == null) {
			tage[tag-1].eintragen(was, prioritaet);
			belegteTage++;
		}else {
			System.out.println("Fehler: "+ tage[tag-1].getVerabredung());
		}
	}
	
	public String getTermin(int tag) {
		return tage[tag-1].getVerabredung();
	}

	
	public int getPrioritaet(int tag) {
		return tage[tag-1].getPrioritaet();
	}
	
	
	public int getBelegt() {
		return belegteTage;
	}
	
}
