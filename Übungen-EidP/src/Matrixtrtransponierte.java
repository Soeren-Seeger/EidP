
public class Matrixtrtransponierte {

	public static void main(String[] args) {
		int[][] a = {
				{1,1,1},
				{2,2,2}
		};
		
		
		int[][] b = new int[a[0].length][a.length];
		
		
		for (int i = 0; i < b.length; i++) {
			
		
			for (int j = 0; j < b[0].length; j++) {
			
				b[i][j] = a[j][i];
		}
	
	}
		
		
		for (int i = 0; i < b.length; i++) {
			System.out.println("");
			
			for (int j = 0; j < b[0].length; j++) {
			
				System.out.print(b[i][j] + " ");
		}
	
	}
		
		
	}	

}
