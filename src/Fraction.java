import java.io.*;

  public class Fraction {
      int num,den;

      public Fraction()
      {
          this.num = 10;
          this.den = 7;
      }


      public String toStringFraction()
      {
        return "\n" + this.num + "/" + this.den;
      }

      public String toStringFloat()
      {
        return "\n" + (float)this.num/this.den;
      }

      public String toStringString()
      {
        return "\n" + this.num + " sur " + this.den; 
      }

      public Fraction(String n, String d)
      {
        try {
          this.num = Integer.parseInt(n);
          this.den = Integer.parseInt(d);
        }
        catch(NumberFormatException e)
        {
          System.err.println("Erreur : l'un des nombres donné n'est pas un entier");
          System.exit(0);
        }
      }
}
