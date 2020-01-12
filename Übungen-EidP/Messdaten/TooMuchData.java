
public class TooMuchData extends Exception {

	TooMuchData (){
		super("Fehler: Zu viele Parameter wurden übergeben!");
	}
	
	TooMuchData (String m){
		super(m);
	}
}

