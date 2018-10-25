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
        return   this.num + "\n--\n" + this.den;
      }

      public Fraction(int n, int d)
      {
        if (n != 0 && n == (int)n) {
          this.num = n;
        }
        else
        {
          System.out.println(" Le num n'est pas un entier ou = 0");
          
        }
        if (d == (int)d) {
          this.den = d;
        }
        else
        {
        System.out.println(" Le den n'est pas un entier");

        }
      }


  }
