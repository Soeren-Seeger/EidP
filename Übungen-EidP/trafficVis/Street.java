
public class Street {

	public int slots = 0;
	int[] track;
	int[] temptrack;
	int vmax = 5;
	double p = 0.1; // Warscheinlichkeit

	public Street(String[] track) {
		this.track = new int[track.length];
		for (int i = 0; i < track.length; i -= -1) {
			if (track[i].equals(".")) {
				this.track[i] = -1;
			} else {
				this.track[i] = Integer.parseInt(track[i]);
			}
		}
		slots = track.length;
	}

	public void step() {
		temptrack = new int[track.length];
		for (int i = 0; i < track.length; i++) {
			temptrack[i] = track[i];
		}

		// Beschleunigen
		for (int i = 0; i < track.length; i++) {// jedes Auto überprüfen
			if (track[i] < vmax && track[i] > -1) { // wenn noch nicht maxV evt. beschleunigen
				if (radar(i, (track[i] + 1)) == track[i] + 1) { // Überptüve auf KOllision bei Beschl um +1.
					temptrack[i] = track[i] + 1;
				}
			}
		}

		// Bremsen
		for (int i = 0; i < track.length; i++) {// jedes Auto überprüfen
			if(track[i] > -1) {
				System.out.println("Radar:" + radar(i, (track[i])));
				if((radar(i, (track[i]))) != track[i]) {
			temptrack[i] = (radar(i, (track[i]))); // Ermittelt anzahl freier Slotz vor ihm ==> neue Geschwindigkeit =
				}								// anz Slots die er vorrücken kann
			}
		}
		// Zufall
		double random;
		for (int i = 0; i < track.length; i++) {// jedes Auto überprüfen
			random = Math.random();
			if (random <= p && track[i] > -1)
				temptrack[i] = temptrack[i] - 1; // Geschw. verringern wenn p erfüllt
		}

		// Fahren
		for (int i = 0; i < track.length; i++) {// jedes Auto überprüfen
			
			if (temptrack[i] > -1) {
			track[i + temptrack[i]] = temptrack[i]; //
			track[i] = -1;
			}
		}
		temptrack = null;// resetz temptrack

	}

	public int radar(int pos, int range) { // Rückgabe: ANzahl an Steps die frei sind
		for (int i = pos + 1; i <= range; i++) {
			if (track[i] != -1) {
				System.out.println(i - pos - 1);
				return (i - pos - 1);
				
			}
		}
		System.out.println("Frei" + range);
		return range;
	}
	
	public void vis() {
		for (int i = 0; i < track.length; i++) {// jedes Auto überprüfen

			if(track[i] == -1) {
				System.out.print(".");
			}else {
				System.out.print(track[i]);
			}
			System.out.print("  ");
			
			

		}
		System.out.println("");
	}
	
}
