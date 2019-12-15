/**
 * Ü6A8
 * IBAN Berrechnung
 * @author Sören Seeger
 */

import java.util.Scanner;

public class IbanOld {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String lc = sc.next();
			String blz = sc.next();
			String kn = sc.next();
			sc.close();
			System.out.println(erzeugeIban(lc, blz, kn));
		}
		public static String erzeugeIban(String laenderkennung, String blz, String nummer) {
			laenderkennung = laenderkennung.toUpperCase();
			nummer = kNummerNorm(nummer);
			String bban = blz+nummer;
			String code24 = bban + laenderConv(laenderkennung);              //bban + DE-Entsprechnung + "00"
			String iban =laenderkennung + (checksum(code24)) + bban;
			return iban;
		}
		public static String kNummerNorm (String nummer) {
			String nummerNorm = nummer;
			for (int i = 0 ; i < (10 - nummer.length()) ; i++) {
				nummerNorm = "0" + nummerNorm;
			}
			return nummerNorm;
		}
		public static String laenderConv (String laenderkennung) {
			char teil;
			int teilZahl = 10;
			String laendercode = "";
			for (int i = 0; i < laenderkennung.length(); i++) { //sooft wie es Bucjstaben in dem Länderteil gibt
			    teil = laenderkennung.charAt(i) ;					//extrahieren des einzelnen CHars des Ländercodes
			    teilZahl = 10; //zurücksetzetn auf 10 für den 2. Durchlauf
				for (int a = 0; a < (teil - 'A') ; a++ ) {			//Differenz zu "A" auf 10 (A = 10) draufrechenen um den Wert für den Buchsaben zu erhalten
					teilZahl = teilZahl + 1;
				}
				laendercode = laendercode + teilZahl ;
			}
			laendercode = laendercode + "00";
			return laendercode;
		}
		public static String checksum (String code24) {
			String part9 = "";
			String puffer = code24;
			long modulowert = 0;
			do {
				if (puffer.length() < 9) {
					part9 = puffer.substring(0, puffer.length());
					modulowert = (Long.parseLong(part9) % 97);        //puffer = Long.toString(modulowert) + puffer.substring(9);
					break;
				}else {
					part9 = puffer.substring(0, 9);
					puffer = Long.toString((Long.parseLong(part9) % 97)) + puffer.substring(9);	
				}
			}while (puffer.length() > 0);
			
			modulowert = 98 - modulowert;
			String prüfziffer;
			if (modulowert < 10) {
				prüfziffer = "0" + (Long.toString(modulowert));
			}else {
				prüfziffer = Long.toString(modulowert);
			}
			return prüfziffer;		
		}
	}
