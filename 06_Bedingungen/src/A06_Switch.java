
public class A06_Switch {
    public static void main(String[] args) {
        int wochentag = 5;

        switch (wochentag) {
            case 1:
                System.out.println("montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mottwich");
                break;
            case 4:
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Samstag");
                break;
            case 7:
                System.out.println("Sonntag");
                break;
            default:
                System.out.println("Kenne ich nicht!");
        }

    }
}
