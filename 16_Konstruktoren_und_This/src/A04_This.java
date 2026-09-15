class Produkt {
    String name;
    double preis;

    Produkt(String name, double preis) {

        this.name = name;
        this.preis = preis;
        System.out.println("macht peng peng!");

        // Produkt.this.name = name;
        // Produkt.this.preis = preis;
    }
}

public class A04_This {
    public static void main(String[] args) {

        Produkt produkt = new Produkt("Gewehr", 1230);

        System.out.println("Produkt: " + produkt.name + " - " + produkt.preis);
    }
}
