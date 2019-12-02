/**
 * Ü6A8
 * IBAN Berrechnung (Swing GUI)
 * @author Sören Seeger
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IbanBerechnen {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String lc = sc.next();
//		String blz = sc.next();
//		String kn = sc.next();
//		sc.close();

		JFrame Frame = new JFrame();
        Frame.setTitle("IBAN berrechner");
        Frame.setSize(900, 100);
        JPanel panel = new JPanel();
        
        JLabel label = new JLabel("Länderkennung");
        panel.add(label);
        
        JTextField feld = new JTextField("DE", 15);
        panel.add(feld);
        
        JLabel label2 = new JLabel("BLZ:");
        panel.add(label2);
        
        JTextField feld2 = new JTextField("(8-stellig)", 15);
        panel.add(feld2);
        
        JLabel label3 = new JLabel("KN:");
        panel.add(label3);
        
        JTextField feld3 = new JTextField("", 15);
        panel.add(feld3);
        
        JLabel erg = new JLabel("");
        panel.add(erg);
        
        JButton buttonOK = new JButton("Berrechnen");
        panel.add(buttonOK);
        Frame.add(panel);
        Frame.setVisible(true);
		
		buttonOK.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
				  erg.setText(erzeugeIban(feld.getText(), feld2.getText(), feld3.getText()));
			  }
	    });
	}
	public static String erzeugeIban(String laenderkennung, String blz, String nummer) {
		laenderkennung = laenderkennung.toUpperCase();
		nummer = kNummerNorm(nummer);
		String bban = blz+nummer;
		String code24 = bban + laenderConv(laenderkennung);              //bban + DE-Entsprechnung + "00"
		String iban =laenderkennung + (98 -checksum("172637456193451112123212")) + bban;
		return iban;
	}
	public static String kNummerNorm (String nummer) {
		String nummerNorm = nummer;
		for (int i = 0 ; i < (10 - nummer.length()) ; i++) {
			nummerNorm = "0" + nummerNorm;
		}
		return nummerNorm;
	}
	public static String laenderConv (String laenderkennung) {
		char teil;
		int teilZahl = 10;
		String laendercode = "";
		for (int i = 0; i < laenderkennung.length(); i++) { //sooft wie es Bucjstaben in dem Länderteil gibt
		    teil = laenderkennung.charAt(i) ;					//extrahieren des einzelnen CHars des Ländercodes
		    teilZahl = 10; //zurücksetzetn auf 10 für den 2. Durchlauf
			for (int a = 0; a < (teil - 'A') ; a++ ) {			//Differenz zu "A" auf 10 (A = 10) draufrechenen um den Wert für den Buchsaben zu erhalten
				teilZahl = teilZahl + 1;
			}
			laendercode = laendercode + teilZahl ;
		}
		laendercode = laendercode + "00";
		return laendercode;
	}
	public static int checksum (String code24) {
		String part9 = "";
		String puffer = code24;

		long modulowert = 0;
		do {
			if (puffer.length() < 9) {
				System.out.println("! <9 :" + puffer.length());
				
				part9 = puffer.substring(0, puffer.length());
				System.out.println("! 9er " + part9);
				modulowert = (Long.parseLong(part9) % 97);        //puffer = Long.toString(modulowert) + puffer.substring(9);
				System.out.println("letzter mod: " + modulowert);
				break;
			}else {
				System.out.println("übrig: " + puffer);
				part9 = puffer.substring(0, 9);
				System.out.println("9er Kette " + part9);
				puffer = Long.toString((Long.parseLong(part9) % 97)) + puffer.substring(9);
				System.out.println("modulo " + Long.parseLong(part9) % 97);
				System.out.println("neu übrig: " + puffer);
			}
		}while (puffer.length() > 0);
		return (int)modulowert;		
	}
}
