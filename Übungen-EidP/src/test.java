
public class test {

	public static void main(String[] args) {

		Studierender s1 = new Studierender("Willi", "Winzig" , 123456);
		s1.neueNote(3F);
		s1.neueNote(1.5F);
		s1.neueNote(2.7F);
		
		System.out.println(s1);
	}

}
