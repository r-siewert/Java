class BeispielObjekt {
    String name = "HanzWurst";

    public String toString() {
        return "teilnehmer: " + name;
    }

}

public class A10_OBjektMethoden {
    public static void main(String[] args) {
        BeispielObjekt objekt = new BeispielObjekt();

        BeispielObjekt gleicheReferenz = objekt;

        BeispielObjekt anderesObjekt = new BeispielObjekt();

        String darstellung = objekt.toString();

        System.out.println(darstellung);
        System.out.println("Vergleich " + (objekt == gleicheReferenz)); // true
        System.out.println("Vergleich " + (objekt == anderesObjekt)); // false

        // liefert den einfachen Klassennamen
        System.out.println("Klasse " + objekt.getClass().getName());

    }
}
