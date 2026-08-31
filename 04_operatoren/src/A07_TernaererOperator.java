public class A07_TernaererOperator {
    public static void main(String[] args) {

        int punkte = 15;

        // wenn Punkte >= 10 sind dann "bestanden", sonst "nicht bestanden"

        String bewertung = punkte >= 10 ? "Bestanden" : "nicht bestanden";

        int bonus = punkte >= 15 ? 5 : 0;

        System.out.println("Bewertung: " + bewertung);
        System.out.println("Bonus: " + bonus);

    }

}
