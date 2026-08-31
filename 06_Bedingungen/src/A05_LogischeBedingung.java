
public class A05_LogischeBedingung {
    public static void main(String[] args) {
        int alter = 22;
        boolean hatAusweis = true;
        if (alter >= 18 && hatAusweis) {
            System.out.println("Entritt erlaubt!");
        }
        if (alter < 18 || !hatAusweis) {
            System.out.println("kein Eintritt");
        }
    }
}
