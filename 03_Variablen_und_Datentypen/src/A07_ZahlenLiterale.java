public class A07_ZahlenLiterale {
    public static void main(String[] args) {

        int dezimalzahl = 255;

        System.out.println("Dezimalzahl: " + dezimalzahl);

        // 0b präfix für Binärzahlen
        // 128,64,32,16,8,4,2,1
        // _0__1__1__1__1_1_1_1
        // 0*128 + 1*64 + 1*32 + 1*16 + 1*8 + 1*4 + 1*2 + 1*1 = 255

        int binaer = 0b11111111; // 255
        System.out.println("Binärzahl: " + binaer);

        // 0 Präfix für Oktalzahlen
        // 64,8,1
        // berechnen: 3*64 + 7*8 + 7*1 = 192 + 56 + 7 = 255
        int oktal = 0377; // 255

        System.out.println("Oktal: " + oktal);

        // Präfix 0x
        // 0-9 A B __C _D _E F
        // ___10 11 12 13 14 15
        // F*16 + F*1
        // 15*16 + 15*1 = 255

        int hexaDezimal = 0xFF; // 255
        System.out.println("Hexadezimal: " + hexaDezimal);

    }

}
