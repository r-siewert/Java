package oop_zsmspiel.konto;

public class A03_MeinKonto {
    public static void main(String[] args) {
        Konto konto1 = new Konto("DE123", 100);
        Konto konto2 = konto1;

        System.out.println("Konto eröffnung: " + konto1.getSaldo());

        konto1.einzahlen(100.00);
        konto2.einzahlen(10.00);

        System.out.println("Saldo nach Transaktion: " + konto1.getInfo());

        konto1.auszahlen(50);

        System.out.println("Saldo nach Transaktion: " + konto1.getInfo());

        System.out.println("KontoInfo: " + konto1.getInfo());
        System.out.println("KontoInfo: " + konto2.getInfo());
    }
}
