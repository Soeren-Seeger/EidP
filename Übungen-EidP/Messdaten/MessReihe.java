
public class MessReihe {

	int maxDatensätze = 0;
	int anzDatensätze = 0;
	Messdatum[] daten;
	
	MessBereich checkU = new MessBereich(0, 12000, 8000);
	MessBereich checkT = new MessBereich(0, 200, 150);
	MessBereich checkD = new MessBereich(0, 6, 5);
	
	
	MessReihe(int n){
		maxDatensätze = n;
		daten = new Messdatum[n];
	}
	
	void neueMessung(int u, double t, double d) throws CriticalValue, IllegalValue, TooMuchData{

			checkU.pruefen(u);
			checkT.pruefen(t);
			checkD.pruefen(d);
		
		
			if(anzDatensätze == maxDatensätze )
				throw new TooMuchData();
			
			//SONST
			daten[anzDatensätze] = new Messdatum(u, t, d);
			anzDatensätze++;
			
			
	}
	
	double[] ermittleMittelwerte(){
		
		double[] werte = new double[3];
		
		for(int i = 0; i < anzDatensätze ; i++) {
			werte[0] = werte[0] + daten[i].getU();
			werte[1] = werte[1] + daten[i].getT();
			werte[2] = werte[2] + daten[i].getD();
		}
		werte[0] = werte[0]/ anzDatensätze;
		werte[1] = werte[1]/ anzDatensätze;
		werte[2] = werte[2]/ anzDatensätze;
				

		return werte;
	}
}
