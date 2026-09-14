
class Guthaben { // Klasse
    int betrag; // Instanzvariable
}

public class A07_ObjektAlsParameter {

    public static void einzahlen(Guthaben konto, int betrag) {
        konto.betrag += betrag;
    }

    public static void main(String[] args) {
        Guthaben konto = new Guthaben(); // erstellt ein Objekt

        konto.betrag = 10;

        einzahlen(konto, 12);
        einzahlen(konto, 12);

        System.out.println("Guthaben: " + konto.betrag);
    }
}
