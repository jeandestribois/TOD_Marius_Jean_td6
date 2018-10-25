import java.io.*;
import java.util.Scanner;

public class Main{
   public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Fraction f;
        int choix=0;
        while(choix!=1 && choix!=2 && choix!=3)
        {
            try
            {
                System.out.println("\nChoisissez l'interface :\n1 : un numérateur et un dénominateur\n2 : juste avec le numérateur\n3 : sans argument");
                choix=Integer.parseInt(sc.nextLine());
            }
            catch(NumberFormatException e)
            {
                System.out.println("Choix non reconnu, recommencez");
            }
        }
        String num, den;
        if(choix==1)
        {
            System.out.println("\n°_°\n\nSaisisez le numerateur :");
            num = sc.nextLine();
            System.out.println("Saisisez le denominateur :");
            den = sc.nextLine();   
        }
        else if(choix==2)
        {
            System.out.println("\n°_°\n\nSaisisez le numerateur :");
            num = sc.nextLine();
            System.out.println("Denominateur egal a 1");
            den = "1";
        }
        else
        {
            System.out.println("\n°_°\n\nNumerateur egal a 0\nDenominateur egal a 1");
            num = "0";
            den = "1";
        }
        f = new Fraction(num,den);

        System.out.println(f.toStringFraction()+"\n"+f.toStringFloat()+"\n"+f.toStringString());


    }
}
