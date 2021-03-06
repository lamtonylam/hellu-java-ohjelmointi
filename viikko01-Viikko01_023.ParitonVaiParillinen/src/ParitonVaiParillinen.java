
import java.util.Scanner;

public class ParitonVaiParillinen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna luku: ");
        int luku = Integer.parseInt(lukija.nextLine());
        int jakojaannos = luku % 2;
        
        if (jakojaannos == 0) {
            System.out.println("Luku " + luku + " on parillinen");
        } else {
            System.out.println("Luku " + luku + " on pariton");
        }
        
        
        
        

    }
}
