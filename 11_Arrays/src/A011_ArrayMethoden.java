import java.util.Arrays;

public class A011_ArrayMethoden {
    public static void main(String[] args) {
        int[] werte = {7, 2, 5};

        Arrays.sort(werte);

        System.out.println("Sortiert: " + Arrays.toString(werte));

        for(int i = 0; i < werte.length; i++ ){
            System.out.println("Sortiert: " + werte[i]);
        }

        // Kopie hat neue werte 2, 5, 7, 0, 0
        int[] kopie = Arrays.copyOf(werte, 5);
        System.out.println("Kopie: " + Arrays.toString(kopie));

        // Kope 2, 5
        int[] kopie1 = Arrays.copyOf(werte, 2);
        System.out.println("Kopie: " + Arrays.toString(kopie1));
        
    }
    
}
