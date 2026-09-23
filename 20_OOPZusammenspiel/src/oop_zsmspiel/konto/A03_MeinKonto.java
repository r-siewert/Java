package oop_zsmspiel.konto;

public class A03_MeinKonto {
    public static void main(String[] args) {
        Konto konto1 = new Konto("DE123", 100);

        System.out.println("Saldo: " + konto1.getSaldo());

        System.out.println(konto1.getInfo());
    }
}
