import java.awt.Color;

import ch.aplu.turtle.Playground;
import ch.aplu.turtle.Turtle;
import ch.aplu.turtle.TurtleFrame;

public class RatPopulation {

	
	static TurtleFrame tf = new TurtleFrame("Ratten Population");
	static Playground pane = new Playground();
	static Turtle printer = new Turtle(tf);
	
	
	public static void main(String[] args) {
		//Startpopulation
		int gr = 2;
		int m1 = 0;
		int m2 = 0;
		
		
		
		tf.setSize(1000, 1000);
		tf.isVisible();

		pane.setSize(1000, 1000);
		pane.isVisible();
		
		pane.add(printer);
		tf.add(pane);
		printer.fd(1);
		printer.setPos(-200, 200);		
		
	
		for (int i = 0; i < 12;i++) {
			gr = gr + m2;
			m2 = m1;
			m1 = gr/2 *12;
			
			
			System.out.println(gr+m1+m2);
			darstellung(gr+m1+m2);
		}
		
		
		
		
		
	}

	
	public static void darstellung (int a) {
		printer.setPos(200, 200);
		      for (int schritte = 0; schritte < 360; schritte++) {
		            printer.rt(1);
		            printer.fd(1.0);
		      }
		

	}
	
	
}
