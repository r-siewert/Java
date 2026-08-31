public class A06_2_Switch {

    public static void main(String[] args) {
        int kategorie = 1;
        int auswahl = 2;

        switch (kategorie) {
            case 1: {
                System.out.println("Kategorie GEtränke");
                switch (auswahl) {
                    case 1:
                        System.out.println("Auswahl: Wasser");
                        break;

                    case 2:
                        System.out.println("Auswahl: Kaffee");
                        break;

                    default:
                        System.out.println("Unbekanntes Getränk");
                        break;
                }
                break;
            }

            case 2: {
                System.out.println("Kategorie: Speisen");
                switch (auswahl) {

                    case 1:
                        System.out.println("Auswahl: Pizza");
                        break;

                    case 2:
                        System.out.println("Auswahl: Salat");
                        break;

                    case 3:
                        System.out.println("Unbekannte Speise");
                        break;

                    default:
                        System.out.println("Unbekannte Kategorie");
                        break;

                }
                break;
            }
        }
    }
}
