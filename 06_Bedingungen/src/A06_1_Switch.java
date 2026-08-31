
public class A06_1_Switch {
    public static void main(String[] args) {
        int wochentag = 6;

        switch (wochentag) {
            case 1:
                System.out.println("Montag");
                break;
            case 6:
            case 7:
                System.out.println("Wochenende");
                break;
            default:
                System.out.println("Werktag");
                break;
        }
    }
}
