package kalender;



public class Kalender {

	public static void main(String[] args) {
		Jahr a = new Jahr(2018);
		Jahr b = new Jahr(2019);
		
		
		a.eintragen(45, "Klausur", 1);
		b.eintragen(37, "Treffen", 5);
		
	
		
		getBelegt(a,17);
		getBelegt(a, 45);
		
		System.out.println("Belegte Tage insgesamt: "+(a.getBelegt()+b.getBelegt()));
		
	}
	
	
	public static void getBelegt(Jahr dJahr,int tag) {
		System.out.print(tag + ". Tag ist ");
		if (dJahr.getTermin(tag) == null) {
			System.out.println("frei");
		}else {
			System.out.println("belegt");

		}
	}

}
