public class A05_SucheMitBreak {
    public static void main(String[] args) {
        int gesuchteZahl = 7;

        for (int nummer = 1; nummer <= 10; nummer++) {
            System.out.println("Pruefe: " + nummer);

            if (nummer == gesuchteZahl) {
                System.out.println("Die gesuchte Zahl " + gesuchteZahl + " wurde gefunden!");
                break;
            }
        }
    }

}
