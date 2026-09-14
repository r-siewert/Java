class Spieler {
    String name; // null
    int punkte; // 0

}

public class A02_Attribute {
    public static void main(String[] args) {
        Spieler spieler = new Spieler();

        System.out.println("StandardName: " + spieler.name); // null
        System.out.println("StandardPunkte: " + spieler.punkte); // punkte

        spieler.name = "Paul";
        spieler.punkte = 1234;

        System.out.println("Spieler: " + spieler.name + ", " + spieler.punkte); // null

    }
}
