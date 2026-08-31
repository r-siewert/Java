class StandardWert {
    int zahl = 5;
    String text;
}

public class A09_StandardWerte {
    public static void main(String[] args) {
        StandardWert werte = new StandardWert();
        System.out.println("Zahl: " + werte.zahl);
        System.out.println("Text ist leer: " + werte.text);

    }
}
