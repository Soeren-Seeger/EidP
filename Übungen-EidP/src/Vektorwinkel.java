/**
 * Ü7A10
 * Berech. des Winkels zw. 2 Vektoren
 * @author Sören Seeger
 */
public class Vektorwinkel {

	public static double winkel(double[] a, double[] b) {
		double winkel = 0;
		
		winkel = Math.acos( (skalar(a,b))   / (   Math.sqrt(skalar(a,a)) * Math.sqrt(skalar(b,b))  )  );
		
		return r2d(winkel);
	}
	
	
	
	public static double skalar(double[] a, double[] b) { //Berrechnung von 2 NFachen Vektoren
		
		double produkt = 0;
		for (int i = 0; i < a.length ; i++) {
			produkt = produkt + (a[i]*b[i]);
		}
		return produkt;
	}
	
	public static double r2d (double wert) { //Radiant zu Grad umrechnung
	
		wert = wert * 180 / Math.PI;
		
		return wert;
	}

}
