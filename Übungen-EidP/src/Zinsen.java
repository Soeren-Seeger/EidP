
public class Zinsen {

	public static void main(String[] args) {
		double K0 = Double.parseDouble(args[0]);
		double p = Double.parseDouble(args[1]);
		double n = Double.parseDouble(args[2]);
		double m = Double.parseDouble(args[3]);
		
		double kn = 0;
		
		String a;
		
		
		kn = K0 * (1 + (p/100) * n);
		System.out.println(kn);
		
		
		kn = K0 *  Math.pow((1+ (p/100)),n);
		System.out.println(kn);				
						
		kn = K0 * Math.pow(1 + ((p/100/m)),(m*n));
		System.out.println(kn);	
	}

}
