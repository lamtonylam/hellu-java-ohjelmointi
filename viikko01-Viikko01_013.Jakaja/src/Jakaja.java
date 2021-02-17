
import java.util.Scanner;

public class Jakaja {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna ensimmäinen luku: ");
        int eka = Integer.parseInt(lukija.nextLine());
        
        System.out.print("Anna toinen luku: ");
        int toka = Integer.parseInt(lukija.nextLine());
        
        double summa = (double) eka / toka;
        
        System.out.println("Jakolasku: " + eka + " / " + toka + " = " + summa );
        // Toteuta ohjelmasi tähän. Muista kysyä luvut käyttäjältä!
    }
}
