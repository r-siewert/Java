public class A07_ArrayAlsParameter {

        public static int berechneGesamtSumme(int[][] werte){
            int summe = 0;

            for(int zeile = 0; zeile < werte.length; zeile++){
                for(int spalte = 0; spalte < werte[zeile].length; spalte++){
                    summe += werte[zeile][spalte];
                }
            }

            return summe;
        }






    public static void main(String[] args) {
        
        int[][] matrix = {
            {2,3},
            {4,5},
            {77, 7}
        };

        System.out.println("Gesamt: " + berechneGesamtSumme(matrix));

    }
}
