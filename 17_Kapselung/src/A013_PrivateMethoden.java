class Rabatt {
    private double preis;

    Rabatt(double preis) {
        this.preis = preis;
    }

    public double berechnePreis(int rabatt) {
        if (!istRabattGueltig(rabatt)) {
            return preis;
        }

        return preis - (preis * rabatt / 100);
    }

    private boolean istRabattGueltig(int rabatt) {
        return rabatt >= 0 && rabatt <= 50;
    }
}

public class A013_PrivateMethoden {
    public static void main(String[] args) {
        Rabatt artikel = new Rabatt(80.0);

        System.out.println("Preis mit 25% Rabatt: " + artikel.berechnePreis(25));
        System.out.println("Ungueltiger Rabatt: " + artikel.berechnePreis(60));
    }
}
