import java.util.Scanner;

public class schwerePaketeMitMethodePruefen {

    public static boolean gewichtChecker(double[] paketGewicht){

        for(int i = 0; i < paketGewicht.length; i++) {
            if(paketGewicht[i] > 10){
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double[] paketGewicht = new double[4];


        System.out.println("Bitte geben Sie vier Paketgewichte als double ein: ");
        for(int i = 0; i < paketGewicht.length; i++){    
        paketGewicht[i] = scanner.nextDouble();
        }


        if (gewichtChecker(paketGewicht)){
            System.out.println("Es wurde ein zu Schweres Paket gefunden!");
        }else{
            System.out.println("Alle Pakete sind im erlaubten Gewicht.");
        }


        scanner.close();
    }
}
