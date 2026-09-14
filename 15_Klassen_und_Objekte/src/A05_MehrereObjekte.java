class Punkt {
    int x;
}

public class A05_MehrereObjekte {
    public static void main(String[] args) {
        Punkt erster = new Punkt(); // Objekterstellung 1

        Punkt zweiter = new Punkt(); // Objekterstellung 2

        erster.x = 3;
        zweiter.x = 5;

        System.out.println("Erster Punkt: " + erster.x);
        System.out.println("Zweiter Punkt: " + zweiter.x);
    }
}
