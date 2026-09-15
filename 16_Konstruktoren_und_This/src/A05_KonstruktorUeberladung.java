
class Fahrzeug {
    String marke;
    int baujahr;

    Fahrzeug() {
        marke = "unbekannt";
        baujahr = 0;
    }

    Fahrzeug(String marke, int baujahr) {
        this.marke = marke;
        this.baujahr = baujahr;
    }
}

public class A05_KonstruktorUeberladung {
    public static void main(String[] args) {
        Fahrzeug erstesFahrzeug = new Fahrzeug();
        Fahrzeug zweitesFahrzeug = new Fahrzeug("VW", 2010);

        System.out.println("Erstes Fahrzeug: " + erstesFahrzeug.marke + " - " + erstesFahrzeug.baujahr);
        System.out.println("Zweites Fahrzeug: " + zweitesFahrzeug.marke + " - " + zweitesFahrzeug.baujahr);
    }
}
