import java.io.*;

  public class Fraction {
      int num,den;

      public Fraction()
      {
          this.num = 10;
          this.den = 7;


      }


      public String toString()
      {
        return   this.num + " / " + this.den;
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

      public void test_egalite(Fraction tmp)
      {
        double first,second;
        first = (double)num/den;
        second = (double)tmp.num / tmp.den;
        if(Double.compare(first,second) == 0) {
          System.out.println("Les fonctions sont egales ");

        }
        else {
          System.out.println("Les fonctions ne sont pas egales apres reduction");
        }
      }
      public void test_comparaison(Fraction tmp)
      {
        double first,second;
        first = (double)num/den;
        second = (double)tmp.num / tmp.den;
        if (first > second) {
            System.out.println("First est >");
        }
        if (first < second) {
            System.out.println("First est <");
        }
        if (first == second) {
            System.out.println("First est = Second ");

        }


      }


}
