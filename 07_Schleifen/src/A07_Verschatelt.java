/*

Einmaleins mit der 1:
1 x 1 = 1
2 x 1 = 2
3 x 1 = 3

Einmaleins mit der 2:
1 x 2 = 2
2 x 2 = 4
3 x 2 = 6

*/

public class A07_Verschatelt {
    public static void main(String[] args) {

        for (int zahl = 1; zahl <= 10; zahl++) {
            System.out.println("Einmaleins mit der " + zahl + ":");
            for (int faktor = 1; faktor <= 10; faktor++) {
                int ergebnis = faktor * zahl;
                System.out.println(faktor + " x " + zahl + " = " + ergebnis);
            }
            System.out.println();
        }

    }

}
