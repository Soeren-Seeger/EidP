public class PolynomTest
{
    public static void main(String[] args)
    {
        double[] testScalars = {};
        Polynom p = new Polynom(testScalars);
        System.out.println(p);
        System.out.println(p.auswerten(2));
        System.out.println(p.getAnzahl());
    }

}