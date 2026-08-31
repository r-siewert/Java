public class A01_GrundAufbau {
    public static void main(String[] args) {
        // mein erstes Hallo Welt

        String ausgabe = ausgabe("Reinhard");
        System.out.println(ausgabe);

        int wert = adder(12, 45);

        System.out.println(wert);
    }

    /**
     * Parameter 1 hier muss ein name rein
     */

    public static String ausgabe(String name) {
        return "hallo welt " + name;

    }

    /*
     * javac -d.\out .\src\Hallowelt.java Ordnerzugriff auf Out, um dort, die
     * kompilierten Datein abzulegen, die aus src Kommen
     * 
     * java -cp .\out Hallowelt
     * 
     */

    /*
     * mein Adder
     * 
     * @param a Erster parameter
     * 
     * @param b Zweiter parameter
     * 
     * @return Das ist die addition
     * 
     * @autor reinhard siewert
     */

    public static int adder(int a, int b) {
        return a + b;

    }

}