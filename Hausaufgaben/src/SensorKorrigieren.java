import java.util.Scanner;

public class SensorKorrigieren {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
     

        int[] startwerte = {45, 51, 999, 48, 50};
        int gesucht = 999;
        int index = 0;

        for(int i = 0; i < startwerte.length; i++){
            //System.out.println(startwerte[i]);

            if( startwerte[i] == gesucht){
                index = i;
                System.out.println("Fehlerhafter Wert gefunden an Index " + index);
            
            }
        }


        
        System.out.println("Bitte geben Sie einen gültigen Wert ein: ");
        int eingabe = scanner.nextInt();

        startwerte[index] = eingabe;

        System.out.println("Korrigierter Wert an Index " + index + ": 4" + eingabe + ", " + startwerte[index]);


        scanner.close();
    }
}
