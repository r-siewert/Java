class Bibliotheksausweis {
    String nummer;
    String fach;

    Bibliotheksausweis(String nummer, String fach) {
        this.nummer = nummer;
        this.fach = fach;
    }

}

class Mitglied {
    String name;
    Bibliotheksausweis ausweis;

    Mitglied(String name, Bibliotheksausweis ausweis) {
        this.name = name;
        this.ausweis = ausweis;
    }

}

public class A01_Bibliothek {
    public static void main(String[] args) {

        Bibliotheksausweis ausweis = new Bibliotheksausweis("B-204", "Sachbuch");
        Mitglied mitglied = new Mitglied("Mira", ausweis);

        System.out.println(mitglied.name);

        System.out.println(ausweis.nummer);
    }
}
