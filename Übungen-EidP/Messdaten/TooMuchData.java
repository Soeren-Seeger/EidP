
public class TooMuchData extends Exception {

	TooMuchData (){
		super("Fehler: Zu viele Parameter wurden �bergeben!");
	}
	
	TooMuchData (String m){
		super(m);
	}
}

