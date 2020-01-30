
public class MessReihe {

	int maxDatens�tze = 0;
	int anzDatens�tze = 0;
	Messdatum[] daten;
	
	MessBereich checkU = new MessBereich(0, 12000, 8000);
	MessBereich checkT = new MessBereich(0, 200, 150);
	MessBereich checkD = new MessBereich(0, 6, 5);
	
	
	MessReihe(int n){
		maxDatens�tze = n;
		daten = new Messdatum[n];
	}
	
	void neueMessung(int u, double t, double d) throws CriticalValue, IllegalValue, TooMuchData{

			checkU.pruefen(u);
			checkT.pruefen(t);
			checkD.pruefen(d);
		
		
			if(anzDatens�tze == maxDatens�tze )
				throw new TooMuchData();
			
			//SONST
			daten[anzDatens�tze] = new Messdatum(u, t, d);
			anzDatens�tze++;
			
			
	}
	
	double[] ermittleMittelwerte(){
		
		double[] werte = new double[3];
		
		for(int i = 0; i < anzDatens�tze ; i++) {
			werte[0] = werte[0] + daten[i].getU();
			werte[1] = werte[1] + daten[i].getT();
			werte[2] = werte[2] + daten[i].getD();
		}
		werte[0] = werte[0]/ anzDatens�tze;
		werte[1] = werte[1]/ anzDatens�tze;
		werte[2] = werte[2]/ anzDatens�tze;
				

		return werte;
	}
}
