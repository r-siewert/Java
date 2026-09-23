package oop_zsmspiel.bestellung;

import java.util.ArrayList;

public class Warenkorb {
    private ArrayList<Produkt> produkte;

    Warenkorb() {
        produkte = new ArrayList<>();
    }

    public void addProdukt(Produkt produkt) {

        produkte.add(produkt);
    }

    public double getGesamtpreis() {
        double summe = 0;

        for (Produkt produkt : produkte) {
            summe += produkt.getPreis();
        }

        return summe;
    }

    public int getAnzahlProdukte() {
        return produkte.size();
    }
}
