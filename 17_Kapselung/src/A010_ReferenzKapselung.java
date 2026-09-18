class Artikel {
    private String name;

    Artikel(String nname) {
        this.name = nname;
    }

    public String getName() {
        return name;
    }
}

class Warenkorb {

    // privater Referenzattribut auf artikel
    private Artikel artikel;

    // Initialisiert das gekapselte Referenzattribut
    Warenkorb(Artikel artikel) {
        this.artikel = artikel;
    }

    // giobt das gespeicherte Artikel Objekt zurück
    public Artikel gArtikel() {
        return artikel;
    }
}

public class A010_ReferenzKapselung {
    public static void main(String[] args) {
        Warenkorb warenkorb = new Warenkorb(new Artikel("Ball")); // hier dann (artikel) für lange Schreibweise
        // gleicher ausdruch wie Artikel artikel = new Artikel("Ball")

        System.out.println("Artikel: " + warenkorb.gArtikel().getName());
    }
}
