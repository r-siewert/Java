public class A02_Ganzzahlen {
    public static void main(String[] args) {

        // - Bereich: von -2.147.483.648 bis + 2.147.483.648 ( ca. -2 Mrd bis +2 Mrd)
        int alter = 39;

        // - Bereich: von -9.233.372.036.54.775.808 bis + 9.233.372.036.54.775.807
        //
        long bevoelkerung = 84000000L;

        long ganzGrosseZahl = 84_000_000_000_00_00L;

        int zahl = (int) ganzGrosseZahl;
        // - wertebereich -128 bis 127
        byte b = 1;

        System.out.println("Byte: " + b);
        System.out.println(zahl);
        System.out.println("Alter: " + alter);
        System.out.println("Bevoelkerung: " + bevoelkerung);
        System.out.println("ganz große Zahl: " + ganzGrosseZahl);

    }
}
