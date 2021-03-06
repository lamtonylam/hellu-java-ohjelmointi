
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna luku ");
        int kerroin = Integer.parseInt(lukija.nextLine());

        int i = 1;
        int tulos = 1;
        
        while (i <= kerroin) {
            tulos = tulos * i;
            i++;
        }
        
        System.out.println("Kertoma on " + tulos);
    }

}
