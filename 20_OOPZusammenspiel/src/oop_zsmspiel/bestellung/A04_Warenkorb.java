package oop_zsmspiel.bestellung;

public class A04_Warenkorb {
    public static void main(String[] args) {
        Produkt p1 = new Produkt("Tastatur", 49.90);
        Produkt p2 = new Produkt("Maus", 23.66);
        Produkt p3 = new Produkt("Atx", 120.00);
        Produkt p4 = new Produkt("Mauspad", 10.00);

        Warenkorb warenkorb = new Warenkorb();

        warenkorb.addProdukt(p1);
        warenkorb.addProdukt(p2);
        warenkorb.addProdukt(p3);
        warenkorb.addProdukt(p4);

        System.out.println("Gesamtpreis: " + warenkorb.getGesamtpreis());
        System.out.println("Anzahl der Produkte: " + warenkorb.getAnzahlProdukte());

    }

}
