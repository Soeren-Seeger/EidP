
public class IllegalValue extends Exception {

	
	IllegalValue (){
		super("Fehler: Parameter au�erhalb des Messbereich!");
	}
	
	IllegalValue (String m){
		super(m);
	}
}


