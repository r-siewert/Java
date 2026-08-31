public class mix2 {
    public static void main(String[] args) {

        int offeneGebuehren = 0;
        boolean ausweisVorhanden = true;

        boolean Ausleihe = offeneGebuehren == 0 && ausweisVorhanden; // true
        boolean Sperre = offeneGebuehren > 0 || !ausweisVorhanden; // false

        System.out.println(Ausleihe);
        System.out.println(Sperre);

        int energie = 18;

        energie -= 5;

        energie += 12;

        energie *= 2;

        boolean Endwert = energie >= 40;

        System.out.println(energie);
        System.out.println(Endwert);

        int alter = 14;

        // String Eintrittspreis = alter >= 10 ? "Bestanden" : "nicht bestanden";

        String Eintrittspreis = alter < 18 ? "6 Euro" : "10 Euro";

        System.out.println("Der Knilch muss " + Eintrittspreis + " bezahlen!");
    }
}
