
public class Gericht {
	
	private double preis;
	private static int gAnzahl = 0;
	
	public Gericht(double preis) {
		this.preis = preis;
		gAnzahl++;
	}
	
	public static int getGesamtAnzahl () {
		return gAnzahl;
	}
	
	public double getPreis () {
		return preis;
	}
}
