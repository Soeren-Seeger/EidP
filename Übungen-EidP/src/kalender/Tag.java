package kalender;



public class Tag {
	
	public String termin = null;
	public int prioritaet = 0;
	
	public void eintragen(String was, int prioritaet) {
		this.termin = was;
		this.prioritaet = prioritaet;
	}
	
	public String getVerabredung() {
		return this.termin;
	}
	
	
	public int getPrioritaet() {
		return this.prioritaet;
	}
}
