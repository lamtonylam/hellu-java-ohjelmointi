
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // tee tähän projektiin tehtävät 41.1-41.5
        // kyseessä on oikeastaan yksi iso tehtävä jota koko ajan laajennetaan
        Scanner lukija = new Scanner(System.in);

        int luku = 0;
        int summa = 0;
        int lukumaara = 0;
        double keskiarvo = 0;
        int parillinen = 0;
        int pariton = 0;

        System.out.print("Syötä luvut: ");

        while (true) {

            luku = Integer.parseInt(lukija.nextLine());
            // jos -1 lopeta loop
            if (luku == -1) {
                break;
            }
            // Tee summan lasku
            summa = summa + luku;
            // lisää lukumäärä
            lukumaara++;
            // keskiarvo lasku
            keskiarvo = (double) summa/lukumaara;
            // parillinen
            if (luku % 2 == 0) {
                parillinen++;
            } else {
                pariton++;
            }
        }
        // tulosta kaikki
        System.out.println("Kiitos ja näkemiin!");
        System.out.println("Summa: " + summa);
        System.out.println("Lukuja: " + lukumaara);
        System.out.println("Keskiarvo: " + keskiarvo);
        System.out.println("Parillisia: " + parillinen);
        System.out.println("Parittomia: " + pariton);
    }
}
