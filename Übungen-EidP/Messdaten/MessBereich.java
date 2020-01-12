
public class MessBereich {


	double min = 0;
	double c = 0;
	double max = 0;
	
	
	
	
	MessBereich(double mini, double maxi, double critical){
		min = mini;
		c = critical;
		max = maxi;
	}
	
	void pruefen(double wert) throws IllegalValue, CriticalValue {
		
		
			if(wert < min || wert > max)
				throw new IllegalValue();
			
			if( wert >= c)
				throw new CriticalValue();
	
	}
}
