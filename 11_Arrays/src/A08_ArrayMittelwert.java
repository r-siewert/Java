public class A08_ArrayMittelwert {
    public static void main(String[] args) {
        int[] noten = {1, 3, 3, 3, 3};
        int summe = 0;

        for(int i = 0; i < noten.length; i++){
            summe += noten[i];
        }
        double notenDurchschnitt = (double) summe / noten.length;    
        System.out.println(notenDurchschnitt);        
    }
}
