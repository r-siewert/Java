package oop_zsmspiel.bestellung;

public class A06_ReferenzVergleich {
    public static void main(String[] args) {
        Produkt p1 = new Produkt("Apfel", 2.33);
        Produkt p2 = new Produkt("Apfel", 2.33);

        System.out.println(p1 == p2); // false
        System.out.println(p1.getName().equals(p2.getName())); // true

    }
}
