import java.io.*;
import java.util.Scanner;

public class Main{
   public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Fraction f, f2;
        int choix=0;
        while(choix!=1 && choix!=2 && choix!=3 && choix!=4)
        {
            try
            {
                System.out.println("\nChoisissez l'interface :\n1 : un numérateur et un dénominateur\n2 : juste avec le numérateur\n3 : sans argument\n4 : comparaison entre deux fractions");
                choix=Integer.parseInt(sc.nextLine());
            }
            catch(NumberFormatException e)
            {
                System.out.println("Choix non reconnu, recommencez");
            }
        }
        String num, den, num2, den2;
        if(choix==1)
        {
            System.out.println("\n°_°\n\nSaisisez le numerateur :");
            num = sc.nextLine();
            System.out.println("Saisisez le denominateur :");
            den = sc.nextLine();

            f = new Fraction(num,den);

            System.out.println(f.toStringFraction()+"\n"+f.toStringFloat()+"\n"+f.toStringString());
        }
        else if(choix==2)
        {
            System.out.println("\n°_°\n\nSaisisez le numerateur :");
            num = sc.nextLine();
            System.out.println("Denominateur egal a 1");
            den = "1";

            f = new Fraction(num,den);

            System.out.println(f.toStringFraction()+"\n"+f.toStringFloat()+"\n"+f.toStringString());
        }
        else if(choix==3)
        {
            System.out.println("\n°_°\n\nNumerateur egal a 0\nDenominateur egal a 1");
            num = "0";
            den = "1";
            
            f = new Fraction(num,den);

            System.out.println(f.toStringFraction()+"\n"+f.toStringFloat()+"\n"+f.toStringString());
        }
        else
        {
            System.out.println("\n°_°\n\nVeuillez donner 2 fractions");
            System.out.println("\nSaisisez le numerateur de la premiere :");
            num = sc.nextLine();
            System.out.println("Saisisez le denominateur de la premiere :");
            den = sc.nextLine();
            System.out.println("\nSaisisez le numerateur de la deuxieme :");
            num2 = sc.nextLine();
            System.out.println("Saisisez le denominateur de la deuxieme :");
            den2 = sc.nextLine();
            
            f2 = new Fraction(num2,den2);
            f = new Fraction(num,den);

            System.out.println(f.toStringFraction()+"\n"+f.toStringFloat()+"\n"+f.toStringString());
            System.out.println(f2.toStringFraction()+"\n"+f2.toStringFloat()+"\n"+f2.toStringString());
            
            f.test_egalite(f2);
            f.test_comparaison(f2);
        }
    }
}
