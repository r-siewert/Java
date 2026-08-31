
public class A03_elseIf {
    public static void main(String[] args) {
        int punkte = 90;

        if (punkte >= 90) {
            System.out.println("Sehr gut!");

        } else if (punkte >= 70) {
            System.out.println("gut");
        } else if (punkte >= 50) {
            System.out.println("bestanden");
        } else {
            System.out.println("durchgefallen");
        }
    }
}
