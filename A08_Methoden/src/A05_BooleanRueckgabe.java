public class A05_BooleanRueckgabe {

    public static boolean istPreisOk(int preis, int guthaben) {
        return guthaben >= preis;

    }

    public static void main(String[] args) {
        int guthaben = 50;

        boolean ok = istPreisOk(30, guthaben);

        if (ok) {
            System.out.println("Guthaben reicht aus!");
        } else {
            System.out.println("Guthaben reicht nicht aus!");
        }
    }
}
