package oop_zsmspiel.adresse;

public class A01_AdresseDemo {
    public static void main(String[] args) {

        Adresse adresse = new Adresse("Musterweg", "Musterstadt");

        System.out.println("Straße: " + adresse.getStrasse());
        System.out.println("Stadt: " + adresse.getStadt());
    }
}
