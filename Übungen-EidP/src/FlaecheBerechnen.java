/**
 * Ü7A9
 * Berech. der Fläche eines Poligons
 * @author Sören Seeger
 */

public class FlaecheBerechnen {

	public static float flaecheBerechnen(float[][] coord) {

		float fläche = 0;
		float dazu = 0;
		int n = coord.length; 
		for (int i = 0; i < coord.length ; i++) {
			dazu = (((coord[i][0]) + (coord[((i+1)%n)][0]))*((coord[((i+1)%n)][1])- (coord[i][1])));
			fläche = fläche + dazu;
		}

		return Math.abs(fläche/2); //Betrag des Erg / 2
	}

}
