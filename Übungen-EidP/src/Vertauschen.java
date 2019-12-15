/**
 * Ü8A6
 * Inhalt vs Ref. von Arrays
 * @author Sören Seeger
 */

public class Vertauschen {

//	public static void main(String[] args) {
//		String[] a = {"Hallo" , "Bitte" , "Leise", "Jetzts"};
//
//		
//		System.out.println(Arrays.toString(vertauscheInhalt(a)));
//		System.out.println(Arrays.toString(vertauscheReferenz(a)));
//		System.out.println(testInhaltGleich(vertauscheInhalt(a), vertauscheReferenz(a)));
//		System.out.println(testReferenzGleich(vertauscheInhalt(a), vertauscheReferenz(a)));
//		
//		
//
//		
//	}
//	
	
	public static String[] vertauscheInhalt(String[] alt) {
		String[] neu = new String[alt.length];
		for (int i = 0; i < alt.length; i++) {
			neu[alt.length-1-i] = "" + alt[i];
		}
		
		return neu;
		
	}
	
	public static String[] vertauscheReferenz (String[] alt) {
		String temp = "";
		for (int i = 0; i < alt.length/2; i++) {
			temp = alt[alt.length-1-i];
			alt[alt.length-1-i] = alt[i];
			alt[i] = temp;
		}
		
		return alt;
	}
	
	
//	public static boolean testInhaltGleich(String[] arg1, String[] arg2) {
//		
//		for (int i = 0; i < arg1.length; i++) {
//			if(!(arg1[i].equals(arg2[i]) )) {
//				return false;
//			}
//			
//		}
//		return true;
//	
//	}
//	
//	public static boolean testReferenzGleich(String[] arg1, String[] arg2) {
//		if(arg1 == arg2)
//			return true;
//		return false;
//			
//		
//	}


}


//wir lernen es jetzt weil wir es wissen