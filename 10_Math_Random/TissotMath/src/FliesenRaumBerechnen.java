import java.util.Scanner;

public class FliesenRaumBerechnen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Bitte geben Sie die Länge des Raumes ein: ");
        double rlaenge = scanner.nextDouble();

        System.out.println("Bitte geben Sie die Breite des Raumes ein: ");
        double rbreite = scanner.nextDouble();

        double laengereSeite = Math.max(rlaenge, rbreite);
        double kuerzereSeite = Math.min(rlaenge, rbreite);

        int vollFliesenLaenge = (int) Math.floor(rlaenge / 0.6);
        int vollFliesenBreite = (int) Math.floor(rbreite / 0.6);

        int benoetigteFliesenLaenge = (int) Math.ceil(rlaenge / 0.6);
        int benoetigteFliesenBreite = (int) Math.ceil(rbreite / 0.6);

        int fliesenInsgesamt = benoetigteFliesenLaenge * benoetigteFliesenBreite; 

        System.out.println("Längere Raumseite: " + laengereSeite + " Meter");
        System.out.println("Kürzere Raumseite: " + kuerzereSeite + " Meter");
        System.out.println("Vollständige Fliesen entlang der Länge: " + vollFliesenLaenge);
        System.out.println("Vollständige Fliesen entlang der Breite: " + vollFliesenBreite);
        System.out.println("Benötigte Fliesen insgesamt: " + fliesenInsgesamt);

        scanner.close();

    }
}
