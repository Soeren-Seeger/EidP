import java.util.Scanner;

public class ChainSorter {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		int i = s.nextInt();
		int j = s.nextInt();
		int k; //Puffervariable

		if (i > j) {
			k = j;
			j = i;
			i = k;
		}
		
		System.out.println(i+ " ≤ " +j);
		
		s.close();	
		
	}

}
