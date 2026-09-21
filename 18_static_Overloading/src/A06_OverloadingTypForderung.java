class TypForderung18 {

    public static void verarbeiten(int n) {
        System.out.println("Int- Methode: " + n);
    }

    public static void verarbeiten(double n) {
        System.out.println("Double- Methode: " + n);
    }
}

public class A06_OverloadingTypForderung {
    public static void main(String[] args) {
        short s = 25;
        float f = 3.4f;
        int i = 10;
        double d = 7.8;
        long l = 123456789L;

        // für short existiert keine passende Überladung
        // der short-wert wird automatisch zu int erweitert
        TypForderung18.verarbeiten(s);

        TypForderung18.verarbeiten(i); // hier wird kein typ umgewandelt, da es ein int ist
        // für float sucht sich java den besten Umwandlungstyp
        // -> double, da es keine passende Überladung gibt.
        // da es kleinen float überladungstyp gibt!
        TypForderung18.verarbeiten(f);
        // Für long existiert keine passende Überladung und wird somit
        // autmatisch in ein double erweitert
        TypForderung18.verarbeiten(l);
        // double ist vorhanden, also keine Typumwandlung nötig!
        TypForderung18.verarbeiten(d);

    }
}
