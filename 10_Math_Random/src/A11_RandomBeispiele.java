import java.util.Random;

public class A11_RandomBeispiele {
    public static void main(String[] args) {
        Random rnd = new Random();
        boolean kopf = rnd.nextBoolean();

        String ergebnis = kopf ? "Kopf":"Zahl";

        System.out.println("Kopf oder Zahl?: " + ergebnis);
    }
}
