
public class WebShop {

	
	Artikel [] artikel = new Artikel [10];
	int anzArtikel = 0;
	
	
	
	
	
	void neuerArtikel(String name, double preis, int anzahl) {
		anzArtikel++;
		artikel[anzArtikel-1] = new Artikel(name, preis, anzahl);
	}
	
	
	Kunde neuerKunde(String vorname, String nachname) {
		
		return (new Kunde(vorname, nachname));
	}
	
	Kunde neuerKunde(String vorname, String nachname, double nachlass) {
		
		return (new GuterKunde(vorname, nachname, nachlass));
	}
	
	
	
	String bestellen(Kunde kunde, String[] artikel) {
		
		String ausgabe;
		double rabatt;
		boolean artikelGefunden = false;
		double gPreis = 0; //Gesamtpreis
		
		if(kunde instanceof GuterKunde) {
			rabatt = ((GuterKunde)kunde).rabatt;
			ausgabe = ( "Rechnung fuer unseren guten Kunden " + kunde.vorname + " " + kunde.nachname + " , Preisnachlass "+ (rabatt*100) +"%: \n"  );
			
		}else {
			ausgabe = ( "Rechnung fuer " + kunde.vorname + " " + kunde.nachname + ": \n"  );
			rabatt = 0;
		}
		
		
		
	
		for (int i = 0; i < artikel.length ; i++) {
			artikelGefunden = false;
			
			for (int j = 0; j < anzArtikel; j++) {
				
				if (artikel[i].equals(this.artikel[j].name)) {
					artikelGefunden = true;
					
					ausgabe = ausgabe + this.artikel[j].name + " : ";
					if (this.artikel[j].bestand != 0){
						this.artikel[j].bestand --;
						if(kunde instanceof GuterKunde) {
							
							ausgabe = ausgabe + (this.artikel[j].preis * (1 - rabatt)) + "\n" ;
							gPreis = gPreis + (this.artikel[j].preis * (1 - rabatt));
						}else {
							ausgabe = ausgabe + (this.artikel[j].preis) + "\n" ;
							gPreis = gPreis + (this.artikel[j].preis) ;
						}
						break;
					}else {
						ausgabe = ausgabe + "nicht mehr vorhanden \n" ;
						break;
					}
					
				}
			}
			if (artikelGefunden == false) {
				ausgabe = ausgabe + artikel[i] + " : "+ "nicht gefunden \n" ;
			}
			
			
		}
		
		ausgabe = ausgabe + "Gesamtpreis : " + gPreis + "\n";
		
		return ausgabe;
	}
}
