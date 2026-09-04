import java.util.Scanner;

public class KundenNummerSuchen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] kdnr = new int[5];
        boolean gefunden = false;

        for(int i = 0; i < kdnr.length; i++){
            System.out.println("Bitte geben Sie Fünf Kundennummern ein: ");
            kdnr[i] = scanner.nextInt();


            System.out.println("Bitte geben Sie die gesuchte Kundennummer ein: ");
            int eingabe = scanner.nextInt();

                if(eingabe == kdnr[i] ){
                    gefunden = true;
                    break;
                }   


        }

        System.out.println("Kunde vorhanden: " + gefunden);


          scanner.close();
    }
}
