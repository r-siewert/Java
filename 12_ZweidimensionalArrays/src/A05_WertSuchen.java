public class A05_WertSuchen {
    public static void main(String[] args) {
        int[][] matrix = {
            { 6, 8, 10},
            { 3, 5, 7 }
        };

        int gesucht = 5;
        boolean gefunden = false;

        for(int zeile = 0; zeile < matrix.length; zeile++){
            for(int spalte = 0; spalte < matrix[zeile].length; spalte++){
                if(matrix[zeile][spalte] == gesucht){
                    gefunden = true;
                    break;
                }
            }
        }
        
        if(gefunden){
            System.out.println("Wert: " + gesucht + " wurde gefunden!");
        }else{
            System.out.println("Wert: " + gesucht + " wurde nicht gefunden!");
        }
    }
}
