class Teilnehmer {
    private static int gesamtZahl;

    private String name;

    public Teilnehmer(String name) {
        this.name = name;
        gesamtZahl++;
    }

    public void vorstellen() {
        System.out.println("Teilnehmer: " + name);
    }

    public static int getGesamtZahl() {
        return gesamtZahl;
    }
}

public class A01_Klassenvariablen {
    public static void main(String[] args) {
        Teilnehmer t1 = new Teilnehmer("Stefan");
        Teilnehmer t2 = new Teilnehmer("Michael");
        Teilnehmer t3 = new Teilnehmer("Franz");

        t1.vorstellen();
        t2.vorstellen();
        t3.vorstellen();

        System.out.println("Gesamt Teilnehmer: " + Teilnehmer.getGesamtZahl());

    }
}
