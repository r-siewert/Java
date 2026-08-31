public class A05_EqualsVergleich {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        String c = new String("Java");
        String d = "Ja" + "va";
        String e = "Ja";
        String f = e + "va";
        String g = "java";

        //vergleich der Referenzen
        System.out.println("Ergebniss:" + (a == b));//true
        System.out.println("Ergebniss:" + (a == c));//false
        System.out.println("Ergebniss:" + (a == d));//true
        System.out.println("Ergebniss:" + (a == f));//false

        //Vergleich der inhalte
        System.out.println("Inhalt a und b " + a.equals(b));//true
        System.out.println("Inhalt a und c " + a.equals(c));//true
        System.out.println("Inhalt a und f " + a.equals(f));//true
        System.out.println("Inhalt c und f " + c.equals(f));//true

        System.out.println("Inhalt g und f " + a.equals(g));//false

        System.out.println("Inhalt g und f " + a.equalsIgnoreCase(g));//true

    }
}
