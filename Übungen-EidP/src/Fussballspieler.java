
public class Fussballspieler extends Person {

	private int einkommen;

	public Fussballspieler(String name, int einkommen) {
		super(name);
		this.einkommen = einkommen;
	}

	public int getEinkommen() {
		return einkommen;
	}
	
//	public void setName(String name) {
//		super.setName(name);
//	}

	public void setEinkommen(int betrag) {
		this.einkommen = betrag;
	}
	
	public String toString() {
		return getName() + " " + getEinkommen();
	}
}