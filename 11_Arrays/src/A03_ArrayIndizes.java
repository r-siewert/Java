public class A03_ArrayIndizes {

    public static String istGrossStadt(Boolean istGrossStadt){

        return istGrossStadt ? "Ja":"Nein";
    }

    public static void main(String[] args) {
        String[] staedte = {"Bremen", "Berlin", "Köln", "Hamburg", "Mölln"};

        Boolean[] istGrossStadt = {false, true, true, true, false};

        System.out.println("Anzahl der Staedte: " + staedte.length);

        System.out.println("Erste Stadt: " + staedte[1] + " ist Großstadt? " + istGrossStadt[1]);

        System.out.println("Zweite Stadt: " + staedte[3] + " ist Großstadt? " + istGrossStadt(istGrossStadt[3]));

        System.out.println("Dritte Stadt: " + staedte[2] + " ist Großstadt? " + (istGrossStadt[2] ? "Ja":"Nein"));
    }
}
