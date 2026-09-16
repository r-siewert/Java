class Bestellung {

    Bestellung() {
        System.out.println("Bestellung angelegt.");
    }
}

public class praccA02_Konstruktorablauf {
    public static void main(String[] args) {
        Bestellung bestellung = new Bestellung();

        System.out.println("Main laeuft.");
    }
}
