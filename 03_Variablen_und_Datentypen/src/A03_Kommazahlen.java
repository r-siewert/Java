public class A03_Kommazahlen {
    public static void main(String[] args) {

        // Bereich: ca. -1.8e308 bis + 1.8e308 (extrem groß oder extrem klein)
        double preis = 19.99;
        // - Bereich ca. -3.4e38 bis +3.4e38 (kleiner als double)
        float temp = 21.5f;

        System.out.println(preis);
        System.out.println("Die Temperatur ist: " + temp);
    }
}
