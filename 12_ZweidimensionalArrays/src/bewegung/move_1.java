package bewegung;

public class move_1 {
public static void main(String[] args) {
    String[][] playfield = new String[5][5];


    // Spielfeld erstellen
    // . . . . .
    // . . . . .
    // . . . . .
    // . . . . .
    // . . . . .
    

    for(int i = 0; i < playfield.length; i++){
        for(int j = 0; j < playfield[i].length; j++){
            playfield[i][j] = ".";
        }
    }

        // Spieler setzen
        playfield[2][2] = "x";


        // Spieler Ausgeben
    for(int i = 0; i < playfield.length; i++){
        for(int j = 0; j < playfield[i].length; j++){
            System.out.print(playfield[i][j] + " ");
        }
        System.out.println();
    }



}    
}
