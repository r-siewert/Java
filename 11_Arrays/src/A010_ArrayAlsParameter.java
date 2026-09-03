public class A010_ArrayAlsParameter {

    public static int berechneZeit(int[] wert){
        
        int zeit = 0;

        for(int i = 0; i < wert.length; i++){
            zeit += wert[i];
        }

        
        return zeit;


    }
    public static void main(String[] args) {
        
        int[] zeit = {6, 7, 8, 34, 66 , 7, 8, 9, 2, 3};
        int zeiten = berechneZeit(zeit);
        System.out.println("Zeit: " + zeiten);
    }
}
