
public class IllegalValue extends RuntimeException {

	
	IllegalValue (){
		super("Fehler: Parameter auﬂerhalb des Messbereich!");
	}
	
	IllegalValue (String m){
		super(m);
	}
}


