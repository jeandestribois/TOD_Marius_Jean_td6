import java.io.*;
import java.util.Scanner;

public class Main{
   public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Fraction f;

        System.out.println("\n°_°\n");
        System.out.println("Saisisez le num :");
        String num = sc.nextLine();
        System.out.println("Saisisez le den :");
        String den = sc.nextLine();

          f = new Fraction(num,den);

          System.out.println(f.toString());


    }
}
