public class Mannschaft {
	
	public Fussballspieler[] ms = new Fussballspieler[5];

	public Mannschaft(Fussballspieler p1, Fussballspieler p2, Fussballspieler p3, Fussballspieler p4,
			Fussballspieler p5) {
		ms[0] = p1;
		ms[1] = p2;
		ms[2] = p3;
		ms[3] = p4;
		ms[4] = p5;
	}

	public int einkommen() {
		int gEinkommen = 0;
		for (int i = 0; i < ms.length; i++) {
			gEinkommen += ms[i].getEinkommen();
		}
		return gEinkommen;
	}

	@Override
	public String toString() {
		String output = "";
		for (int i = 0; i < ms.length; i++) {
			output += (i + 1) + ". " + ms[i].getName() + "\n";
		}
		return output;
	}
}