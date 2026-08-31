import java.util.Scanner;

public class tissot_aufgaben {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Stationsname: ");
        String Stationsname = scanner.nextLine();

        System.out.println("Der Stationsname ist " + Stationsname);
        scanner.close();
    }

}
