
public class IllegalValue extends RuntimeException {

	
	IllegalValue (){
		super("Fehler: Parameter au�erhalb des Messbereich!");
	}
	
	IllegalValue (String m){
		super(m);
	}
}


