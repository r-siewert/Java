import java.time.LocalDate;
import java.util.Scanner;

public class A13_LocalDate {
    public class A13_LocalDateAufgabe {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int jahr = scanner.nextInt();
            int monat = scanner.nextInt();
            int tag = scanner.nextInt();
            int addition = scanner.nextInt();

            LocalDate start = LocalDate.of(jahr, monat, tag);
            LocalDate spaeter = start.plusDays(addition);

            System.out.println("Startdatum: " + start);
            System.out.println("Lieferdatum: " + spaeter);
            System.out.println("Startjahr: " + start.getYear());
            System.out.println("Startmonat: " + start.getMonthValue());
            System.out.println("Starttag: " + start.getDayOfMonth());
            System.out.println("Lieferdatum liegt nach Startdatum: " + spaeter.isAfter(start));

            scanner.close();
        }
    }
}
