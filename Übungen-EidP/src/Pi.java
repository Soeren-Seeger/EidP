
public class Pi {

	public static void main (String[] args) {
		//forMethode();
		doMethode();
		
	}
	
	
	static double forMethode () {
		int vorzeichen = 1;
		double summe = 0;
		
		for (int i = 0; i < 1000000; i++) {
			summe += (vorzeichen/((2*i)+1));
			vorzeichen = -vorzeichen;
		}
		
		summe *= 4;
		System.out.println(summe);
		return summe;
	}
	
	static double doMethode () {
		int vorzeichen = 1;
		double summe = 0;
		double epsilon = 1e-7;
		double summand = 0.0;
		int i = 0;
		
		do{
			summand = (vorzeichen/((2*i)+1));
			summe += summand;
			vorzeichen = -vorzeichen;
			i++;
		}while (Math.abs(summand) > epsilon);
		
		summe *= 4;
		return summe;
	}
}
