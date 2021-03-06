
public class Tulostelua {

    public static void tulostaTahtia(int maara) {
        // 44.1
        int i = 0;
        String tulostus = "";
        while (i < maara) {
            tulostus = tulostus + " ";
            i++;

        }
        System.out.print(tulostus);
    }

    public static void tulostaNelio(int sivunpituus) {
        // 44.2
        int printattu = 0;

        while (printattu < sivunpituus) {
            tulostaTahtia(sivunpituus);
            printattu++;
        }

    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        // 44.3
        int rivi = 0;

        while (rivi < korkeus) {
            tulostaTahtia(leveys);
            rivi++;
        }

    }

    public static void tulostaKolmio(int koko) {
        // 44.4
        int tahti = 0;
        int alkukoko = koko - (koko - 1);

        while (tahti < koko) {
            tulostaTahtia(alkukoko);
            tahti++;
            alkukoko++;
        }

    }

    public static void main(String[] args) {

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        tulostaTahtia(3);
        System.out.println("\n---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(5, 6);
        System.out.println("\n---");
        tulostaKolmio(3);
        System.out.println("\n---");
    }

}
