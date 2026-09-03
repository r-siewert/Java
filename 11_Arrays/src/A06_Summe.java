public class A06_Summe {
    public static void main(String[] args) {
        
        int[] werte = { 4, -7, 0, -3, -6, 4};
        int summe = 0;


        //-3 -2 -1 0 1 2 3
        for(int i = 0; i < werte.length; i++){
            
            // summe += Math.abs(werte[i]);


            if(werte[i] == 0){
                continue;
            }

            if (werte[i] < 0){
                werte[i] = Math.abs(werte[i]);
            }


            summe += werte[i];
        }

        System.out.println("Summe: " + summe); // 24

    }
}
