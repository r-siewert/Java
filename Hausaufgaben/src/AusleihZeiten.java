import java.util.Scanner;

public class AusleihZeiten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ausleihdauer = new int[4];
        int summe = 0;

        for(int i = 0; i < ausleihdauer.length; i++){
            System.out.println("Bitte geben Sie vier Werte in volle Stunden ein: ");
            ausleihdauer[i] = scanner.nextInt();

            if(ausleihdauer[i] == 0){
                continue;
            }
            if(ausleihdauer[i] < 0){
                ausleihdauer[i] = Math.abs(ausleihdauer[i]);
            }

            summe += ausleihdauer[i];
        }

        System.out.println("Summe: " + summe);


        scanner.close();
    }


}
