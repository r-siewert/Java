import java.time.LocalDate;

public class A13_LieferdatumBerechnen {
    public static void main(String[] args) {

        int jahr = Integer.parseInt(args[0]);
        int monat = Integer.parseInt(args[1]);
        int tag = Integer.parseInt(args[2]);
        int addition = Integer.parseInt(args[3]);

        LocalDate start = LocalDate.of(jahr, monat, tag);
        LocalDate spaeter = start.plusDays(addition);

        System.out.println("Startdatum: " + start);
        System.out.println("Lieferdatum: " + spaeter);
        System.out.println("StartJahr: " + start.getYear());
        System.out.println("StartMonat: " + start.getMonthValue());
        System.out.println("StartTag: " + start.getDayOfMonth());
        System.out.println("Lieferdatum liegt nach Startdatum: " + spaeter.isAfter(start));

    }
}
