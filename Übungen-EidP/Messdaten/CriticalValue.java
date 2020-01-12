
public class CriticalValue extends Exception {

	
//	CriticalValue(){
//		super("Der Wert liegt im kritischen Berreich");
//	}
	
	CriticalValue(){
		super("Fehler: Der Wert liegt im kritischen Berreich");
	}
	
	CriticalValue (String m){
		super(m);
	}
	
}
