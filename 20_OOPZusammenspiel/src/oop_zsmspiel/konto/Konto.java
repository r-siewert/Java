package oop_zsmspiel.konto;

public class Konto {
    private String iban;
    private double saldo;

    public Konto(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    private String getIban() {
        return iban;
    }

    public String getInfo() {
        return "KontoInfo iban: " + getIban() + ", Saldo= " + saldo + " EUR";
    }

    public void einzahlen(double betrag) {
        if (betrag > 0) {
            saldo = saldo + betrag;
        }
    }

    public void auszahlen(double betrag) {
        if (betrag > 0 && saldo >= betrag) {
            saldo = saldo - betrag;
        }
    }

}
