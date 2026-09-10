public class A04_Throw {

    public static int verdoppeln(int wert) {

        if (wert < 0) {
            // throw löst die erzeugte Exception aus
            throw new IllegalArgumentException("Wert darf nicht negativ sein"); // ich bin eine special exception bitte
                                                                                // greif mich ab

        }

        return wert * 2;
    }

    public static void main(String[] args) {
        try { // mit -12 wird die Exception geschmissen
            System.out.println("Ergebnis: " + verdoppeln(-12));
        } catch (Exception e) {
            System.out.println("ungültiger Wert: " + e.getMessage());
        }
    }
}
