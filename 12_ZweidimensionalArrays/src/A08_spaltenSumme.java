public class A08_spaltenSumme {
    public static void main(String[] args) {
        int[][] matrix = {
            {2, 4, 3},
            {7, 8, 7}
        };


        //int summe = 0;

        for(int spalte = 0; spalte < matrix[0].length; spalte++){
              int summe = 0;
        
              for(int zeile = 0; zeile < matrix.length; zeile++ ){
                summe += matrix[zeile][spalte];

            }
            System.out.println("Spaltensumme: " + summe);
        }
    }
}
