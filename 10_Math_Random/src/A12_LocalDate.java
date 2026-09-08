import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class A12_LocalDate {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2024, 2, 28);
        System.out.println("Start Datum: " + start); // 2024-02-28

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Start Datum: " + start.format(format));

        LocalDate spaeter = start.plusDays(3);
        System.out.println("Spaeter: " + spaeter); // 2024-03-02

        LocalDate frueher1 = start.minusDays(1);
        System.out.println("Frueher 1: " + frueher1); // 2024-02-27

        LocalDate frueher2 = spaeter.minusDays(1);
        System.out.println("Frueher 2: " + frueher2); // 2024-03-01

        // das Jahr ausgeben
        System.out.println("Jahr: " + start.getYear());
        // den Monat ausgeben
        System.out.println("Jahr: " + start.getMonthValue());
        // den Tag ausgeben
        System.out.println("Jahr: " + start.getDayOfMonth());
        // kommt 2024-03-02 nach 2024-02-28 gibt boolean zurück
        System.out.println("Spaeter liegt nach dem Start!: " + spaeter.isAfter(start));
        // 2024-02-28 vor 2024-03-02 boolean zurück
        System.out.println("Start kommt vor Spaeter: " + start.isBefore(spaeter));
    }
}
