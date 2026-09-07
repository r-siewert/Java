package bewegung;

public class move_2 {


    public static void createPlayField(String[][] playField){
            // Spielfeld erstellen
    for(int i = 0; i < playField.length; i++){
        for(int j = 0; j < playField[i].length; j++){
            playField[i][j] = ".";
        }
    }

    }
    // Spieler setzen
    public static void setPlayerPositionXY(String[][] playField, int posi_x, int posi_y){
        playField[posi_x][posi_y] = "x";
    }

    // Spieler Ausgeben
    public static void printPlayField(String[][] playField){

        for(int i = 0; i < playField.length; i++){
        for(int j = 0; j < playField[i].length; j++){
            System.out.print(playField[i][j] + " ");
        }
        System.out.println();
    }

    }





    public static void main(String[] args) {
        String[][] playField = new String[5][5];


        // Spielfeld erstellen
        createPlayField(playField);

        // Spieler setzen
        setPlayerPositionXY(playField, 2, 2);


        // Spielfeld anzeigen
        printPlayField(playField);



        
        


        
    



    }    
}
