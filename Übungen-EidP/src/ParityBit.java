
public class ParityBit {

	public static void main(String[] args) {
		int wert = 0x17;

		//P-Bit extraktion
		int pbit = wert & 0x1;

		
		//Wert ohne P-Bit (P-bit fällt rechts runter)
		//wert = wert >> 1;
		//hier 4 mal in der Schleife
		
		int quersumme = 0;				//Quersummenberrechnung
		for(int i = 0; i < 4; i++) {	//immer das Niedrigste Bit dazuzählen und dann runterfallenlassen
			wert = wert >> 1;
			quersumme = quersumme + (wert & 0x1);
		}
		
		
		System.out.println((quersumme % 2 == pbit));

		System.out.println(quersumme);

		System.out.println(pbit);
		
		
	}

}
