
public class ZahlenSortierer {

	public static void main(String[] args) {
		int x = 5;
		int y = 7;
		int z = 2;
		
		if (x < y && x < z) {    // x = kleinste
			System.out.println(x);
			if (y < z) {		//entscheiden zw y und z wer größer ist
				System.out.println(y );
				System.out.println(z);
			}
		}
		
		if (y < z && y < x) {    // x = kleinste
			System.out.println(y);
			if (z < x) {		//entscheiden zw y und z wer größer ist
				System.out.println(z);
				System.out.println(x);
			}
		}
		
		if (z < x && z < y) {    // x = kleinste
			System.out.println(z);
			if (x < y) {		//entscheiden zw y und z wer größer ist
				System.out.println(x);
				System.out.println(y);
				
			}
		}
		

		
		
		
		
		
		
		

	}

}
