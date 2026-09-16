class Passwort {
    int laenge;

    Passwort(int plaenge) {
        if (laenge < 8) {
            throw new IllegalArgumentException("Zu kurz");
        }

        this.laenge = plaenge;
    }

}

public class praccA06_passwort {
    public static void main(String[] args) {

        try {
            Passwort passwort = new Passwort(8);

            System.out.println(passwort.laenge);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
