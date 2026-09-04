import java.util.Scanner;

public class testergebnisseAuswerten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        


        double[] testErgebnisse = new double[5];
        double sum = 0;
        int ueND = 0;


        for(int i = 0; i < testErgebnisse.length; ++i){
            
            System.out.println("Geben Sie fuenf Testergebnisse ein: ");
            testErgebnisse[i] = scanner.nextDouble();

            sum += testErgebnisse[i];
            }

            

            double notenDurchschnitt = (double) sum / testErgebnisse.length;    
            System.out.println("Durchschnitt: " + notenDurchschnitt);   


        for(int j = 0; j < testErgebnisse.length; j++){

            if(testErgebnisse[j] > notenDurchschnitt){
                ueND += 1;
            }
                       
            }

            System.out.println("Ergebnisse über dem Durchschnitt: " + ueND);
            scanner.close();
    }
}
