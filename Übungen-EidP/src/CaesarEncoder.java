import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CaesarEncoder {

	static int key = 0;
	static String codeS;
	
	
	public static void main(String[] args) {

				
				
				JFrame Frame = new JFrame();
		        Frame.setTitle("Cäsar Encoder");
		        Frame.setSize(300, 200);
		        JPanel panel = new JPanel();
		        
		        JLabel label = new JLabel("Phrase eingeben:");
		        panel.add(label);
		        
		        JTextField feld = new JTextField("(text)", 15);
		        panel.add(feld);
		        
		        JLabel label2 = new JLabel("Schlüssel eingeben:");
		        panel.add(label2);
		        
		        JTextField feld2 = new JTextField("(Zahl)", 15);
		        panel.add(feld2);
		        
		        JLabel crypt = new JLabel("erg");
		        panel.add(crypt);
		        
		        JButton buttonOK = new JButton("Verschlüsseln");
		        panel.add(buttonOK);
		        Frame.add(panel);
		        Frame.setVisible(true);
				
				buttonOK.addActionListener(new ActionListener()
				{
					  public void actionPerformed(ActionEvent e)
					  {
					    
					    
					    
					    codeS = feld.getText();
					    codeS = codeS.toUpperCase();
					    System.out.println(codeS);
					    key = Integer.parseInt(feld2.getText());
					    
					    char[] codeC = codeS.toCharArray();
					    System.out.println(Arrays.toString(codeC));
					    
					    char[] cryptC = codeC;
					    
					    System.out.println(codeC.length);
					    for (int i = 0; i< codeC.length; i++) {
					    	
					    	codeC[i] = (char) ((int)codeC[i] + key);
					    	
					    	if (codeC[i] > 'Z') {
					    		codeC[i] = (char)((int)codeC[i] - 26);
					    	}
					    	cryptC[i] = codeC[i];
					    	System.out.println(codeC[i]);
					    }
					    
					    String cryptS = String.valueOf(cryptC);
					    
					    crypt.setText(cryptS);
					    panel.add(crypt);
					    
					    
					  }
					});
		        
		        
				
			
				
	}
		

}


