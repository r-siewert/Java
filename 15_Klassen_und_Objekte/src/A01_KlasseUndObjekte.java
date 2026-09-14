
class Lampe { // Klasse
    // Instanzvariable
    String farbe;

    void einschalten() { // Methode
        System.out.println("Lampe " + farbe + " ist an!");
    }

}

public class A01_KlasseUndObjekte {
    public static void main(String[] args) {

        Lampe lampe = new Lampe();

        lampe.farbe = "Gelb";

        lampe.einschalten();

    }
}
