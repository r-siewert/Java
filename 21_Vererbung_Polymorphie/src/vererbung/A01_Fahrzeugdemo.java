package vererbung;

public class A01_Fahrzeugdemo {
    public static void main(String[] args) {
        Auto auto = new Auto("Mercedes", 4);

        auto.starten();

        Motorrad motorrad = new Motorrad("Kawasaki", 2);

        motorrad.starten();
    }
}
