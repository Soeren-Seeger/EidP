import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LaborStand {

	public static void main(String[] args) {
		MessReihe messReihe = null;
		int maxAnzahlDatensaetze = 0;
		
		try {
			maxAnzahlDatensaetze = Integer.parseInt(args[0]);
			messReihe = new MessReihe(maxAnzahlDatensaetze);

			Scanner sc = new Scanner(new File(args[1]));
			while (sc.hasNext()) {
				int u = sc.nextInt();
				double t = sc.nextDouble();
				double d = sc.nextDouble();
				messReihe.neueMessung(u, t, d);
			}
			sc.close();

		} catch (CriticalValue e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}catch (IllegalValue e) {
			System.out.println(e.getMessage());
		}catch (TooMuchData e) {
			System.out.println(e.getMessage());
		} catch (FileNotFoundException e) {
			System.out.println("Fehler: Datei nicht gefunden");
		} catch (InputMismatchException e) {
			System.out.println("Fehler: Datei enthält fehlerhafte Elemente");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Fehler: Zu wenige Startparameter");
		} catch (NullPointerException e) {
			System.out.println("Fehler: Falscher Startparameter (MaxAnzDateien)");
		} catch (Exception e) {
			System.out.println("Fehler: Undefinierter Fehler - Admin benachrichtigen");
		} finally {

			double[] mittelwerte = messReihe.ermittleMittelwerte();
			System.out.println("Durchschnitt von Umdrehungszahl: " + mittelwerte[0]);
			System.out.println("Durchschnitt von Temperatur: " + mittelwerte[1]);
			System.out.println("Durchschnitt von Ladedruck: " + mittelwerte[2]);
		}
	}

}
