
public class StreetMaintenance {
	
	static String[] track = {".",".",".","3","3",".",".",".",".",".",".",".",".",};

	public static void main(String[] args) {
		Street a66 = new Street(track);

		
		a66.vis();
		
		a66.step();
		
		a66.vis();
		
	}

}
