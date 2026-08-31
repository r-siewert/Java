
public class A04_ElseIfVerschachtlung {
    public static void main(String[] args) {
        int punkte = 69;

        if (punkte >= 90) {
            System.out.println("sehr gut");
        } else {
            if (punkte >= 70) {
                System.out.println("gut");
            } else {
                if (punkte >= 50) {
                    System.out.println("bestanden");
                } else {
                    System.out.println("nicht bestanden");
                }
            }
        }
    }
}
