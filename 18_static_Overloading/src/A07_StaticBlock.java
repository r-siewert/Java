class Konfig18 {
    public static String umgebung;
    public static int maxVerbidungen;

    static {
        umgebung = "BliBlaBlub";
        maxVerbidungen = 50;
        System.out.println("Static block ausgeführt!");
    }

    public Konfig18() {
        System.out.println("Konstruktor ausgeführt!");
    }

}

public class A07_StaticBlock {
    public static void main(String[] args) {

        System.out.println("Programm start!");

        System.out.println("Umgebung: " + Konfig18.umgebung);

        new Konfig18();
    }
}
