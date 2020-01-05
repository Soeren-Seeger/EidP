public class Polynom
{

    private double[] skalare;
    private static int polynomZaehler =0;
    private String polynomFormat = "";
    

    public Polynom(double[] koeffizienten)
    {
        if (koeffizienten.length == 0)
        {
            System.out.println("Fehler: Es wurde kein Kooefizient wurden übergeben. Abbruch");
            return;
        }
        skalare = new double[koeffizienten.length-1];
        skalare = koeffizienten;
        erstellePolynomFormat();
        polynomZaehler++;
    }
    private void erstellePolynomFormat()
    {
        int anfang = this.skalare.length - 1;
        for (int i = anfang; i >= 0; i--)
        {
            if (skalare[i] != 0) 
            {
                polynomFormat += ((i ==0)? "" + skalare[i] + "*x^" + i:"" + skalare[i] + "*x^" + i + " + ");
            }
        }
        if(polynomFormat == ""){polynomFormat += "0";}
    }

    public double auswerten(double x){
    	
    	double product = 0;
    	
        if(this.skalare == null){
        	
            System.out.println("Fehler: Da dieses Objekt null ist, kann keine Auswertung erfolgen. ");
            return 0;
        }
        
        for (int i = this.skalare.length-1; i>=0; i--){
            product += Math.pow(x,i) * skalare[i];
        }
        return product;
    }
    public static int getAnzahl(){
    	
        if(polynomZaehler == 0){
        	
            System.out.println("Fehler: Keine Polynom-Objekt vorhanden. Wurde der Kooeffitient übergben?");
        }
        return polynomZaehler;
    }


    @Override
    public String toString(){
    	
        return  ((this.polynomFormat == "") ? "Fehler: Dieses Objekt ist kein String." : this.polynomFormat);
    }











}