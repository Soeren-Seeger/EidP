
public class Salat extends Gericht {

	private static int anzahl;
	
	public Salat(double gewicht) {
		super((gewicht/100) * 0.3);
		anzahl++;
		
	}

	public static int getAnzahl () {
		return anzahl;
	}
	
	
}
