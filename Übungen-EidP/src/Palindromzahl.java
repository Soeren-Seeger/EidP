public class Palindromzahl {

	public static void main(String[] args) {
		int zahl = Integer.parseInt(args [0]);

		System.out.println(spiegeln(zahl));
		System.out.println(spiegelAddieren(zahl));
		
		int test = zahl;
		while (!(palindromTest(test))){
			test = spiegelAddieren(test);
		}
		System.out.println(test);
		
	}

	
	static int spiegeln(int zahl) {
		int qw = 0; //Quotientenwert
		int länge = 1;
		int zählZahl = zahl;
		int spiegelzahl = 0;
		
		for (int i = 1; i < 100 ; i++) {
			qw = (zählZahl / 10);
			if(qw == 0) {
				länge = i;
				break;
			}else {
				zählZahl = zählZahl / 10;
			}
				
		}
		
		zählZahl = zahl;

		for (int m = länge; m > 0 ;m--) {
			spiegelzahl = (int) (spiegelzahl + ((zählZahl % 10) * Math.pow(10, (m-1))));
			zählZahl = zählZahl /10;
		}
				
		return spiegelzahl;
	}
	
	public static int spiegelAddieren(int zahl) {
		
		zahl = zahl + spiegeln(zahl);
		
		return zahl;
	}
	
	public static boolean palindromTest(int zahl) {
		
		if (zahl == spiegeln(zahl)) {
			return true;
			
		}else
		
		return false;
	}
}
