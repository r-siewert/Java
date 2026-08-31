public class A06_4_Switch {
    public static void main(String[] args) {
        int auswahl = 1;
        int alter = 17;

        switch (auswahl) {
            case 1:

                System.out.println("Auswahl: Kinokarten");
                if (alter >= 18) {
                    System.out.println("Eintritt Erlaubt");
                } else {
                    System.out.println("Eintritt Erlaubt");
                }

                break;

            case 2:

                System.out.println("Auswahl: Museum");
                break;

            default:
                System.out.println("ungültige Auswahl");
                break;
        }
    }

}
