public class Switchmodern {
    public static void main(String[] args) {
        int wochentag = 2;
        int wochentag2 = 3;

        switch (wochentag) {
            case 1 -> System.out.println("Montag");
            case 2 -> System.out.println("Dienstag");
            case 3 -> System.out.println("Mittwoch");

            default -> System.out.println("Ungültiger Wochentag!");

        }

        String wt = switch (wochentag2) {
            case 1 -> "Montag";
            case 2 -> "Dienstag";
            case 3 -> "Mittwoch";
            default -> "ungültiger WT";

        };

        System.out.println(wt);
    }

}
