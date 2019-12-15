
public class Artikel {
	
	public String name = "";
	public double preis = 0;
	public int bestand = 0;
	
	
	public Artikel(String name, double preis, int bestand) {
		super();
		this.name = name;
		this.preis = preis;
		this.bestand = bestand;
	}
	
	
	public String toString() {
		return name;
	}
}
