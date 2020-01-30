public class Stadion {
	public static void main(String[] args) {
		Person[] zuschauer = new Person[45000];
		
		Mannschaft team1 = new Mannschaft(new Fussballspieler("1", 0), new Fussballspieler("1", 0),
				new Fussballspieler("1", 0), new Fussballspieler("1", 0), new Fussballspieler("1", 0));
		
		Mannschaft team2 = new Mannschaft(new Fussballspieler("1", 0), new Fussballspieler("1", 0),
				new Fussballspieler("1", 0), new Fussballspieler("1", 0), new Fussballspieler("1", 0));

		
		for (int i = 0; i < zuschauer.length; i++) {
			zuschauer[i] = new Person("Zuschauer-" + (i + 1));
		}

		for (int i = 0; i < 5; i++) {
			team1.ms[i].setEinkommen(10000 * (i + 1));
			team1.ms[i].setName("Spieler-rot-" + (i + 1));
			
			t
			
			
		 meam2.ms[i].setEinkommen(20000 * (i + 1));
			team2.ms[i].setName("Spieler-blau-" + (i + 1));
		}

		System.out.println(team1.toString());
		System.out.println(team2.toString());
		System.out.println(team1.einkommen());
		System.out.println(team2.einkommen());
		System.out.println(zuschauer[0]);

	}
}