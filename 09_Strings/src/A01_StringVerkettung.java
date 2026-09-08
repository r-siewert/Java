
public class A01_StringVerkettung {
    public static void main(String[] args) {
        String beisspiel = "Er 'sagte' \"hallo\" ";
        System.out.println(beisspiel);
        char einzelzeichen = '\'';
        System.out.println(beisspiel + " was auch immer" + einzelzeichen);

        String name = "Stef" + "an";//stefan
        System.out.println(name);

        String name1 = "Stef".concat("an");//stefan
        System.out.println(name1);

        String vor_und_nachname = name.concat(" Tissot");//stefan tissot
        System.out.println(vor_und_nachname);

        String grossGeschrieben = vor_und_nachname.toUpperCase();//STEFAN TISSSOT
        System.out.println(grossGeschrieben);

        String alles = "Alles ".concat("ausser Mutti ").toUpperCase().concat(" 12345 ")
                + grossGeschrieben.toLowerCase();
        System.out.println(alles);

        String gruss = "Hallo java";

        String vorherigeReferenz = gruss;

        gruss = gruss + "!";

        System.out.println("Vergleich " + (gruss == vorherigeReferenz));

    }
}
