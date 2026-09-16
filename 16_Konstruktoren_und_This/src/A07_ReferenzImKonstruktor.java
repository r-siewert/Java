class Kunde {

    // Das Attribut gehört zu einem bestimmten Kunden
    String name;

    // Konstruktor - bbeim Erzeugen eines Kunden, muss ein Name übergeben werden
    Kunde(String name) {
        // this.name ist das Attribut des neuen Objektes
        this.name = name;
    }
}

class Bestellung {

    // Dieses Attribut kann eine Referenz auf ein KundenObjekt speichern
    Kunde kunde;

    Bestellung(Kunde kunde) {
        // this.kunde ist das Attribut der Bestellung
        // Die Referenz auf das KundenObjekt wird im Attribut gespeichert
        this.kunde = kunde;

    }
}

public class A07_ReferenzImKonstruktor {
    public static void main(String[] args) {

        Kunde kunde = new Kunde("Peteter");
        Bestellung bestellung = new Bestellung(kunde);

        System.out.println("Bestellung: " + bestellung.kunde.name);

    }
}
