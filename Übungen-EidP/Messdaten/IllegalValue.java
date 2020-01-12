
public class IllegalValue extends Exception {

	
	IllegalValue (){
		super("Fehler: Parameter auﬂerhalb des Messbereich!");
	}
	
	IllegalValue (String m){
		super(m);
	}
}


