public class A09_Scope {

    public static int addierer1(int wert) { // gehört der Klasse
        int lokal = 10;
        return wert + lokal;
    }

    public int addierer2(int wert) { // gehören dem Objekt
        int lokal = 20;
        return wert + lokal;

    }

    public int addierer3(int wert) { // gehören dem Objekt
        int lokal = 20;
        return wert + lokal;

    }

    public static void main(String[] args) {
        int lokal = 20;

        int lokal1 = addierer1(33);
        System.out.println("lokal1: " + lokal1);

        int lokal2 = new A09_Scope().addierer2(55);
        System.out.println("lokal2: " + lokal2);

        A09_Scope obj = new A09_Scope(); // Instanz Variable auf ein Objekt
        int lokal3 = obj.addierer2(13);
        int lokal4 = obj.addierer3(13);
        System.out.println("lokal3: " + lokal3);
        System.out.println("lokal4: " + lokal4 + lokal);
    }

}
