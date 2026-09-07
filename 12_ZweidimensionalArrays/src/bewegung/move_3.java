package bewegung;

public class move_3 {

    public static void createPlayField(String[][] playField) {
        // Spielfeld erstellen
        for (int i = 0; i < playField.length; i++) {
            for (int j = 0; j < playField[i].length; j++) {
                playField[i][j] = ".";
            }
        }

    }

    // Spieler setzen
    public static void setPlayerPositionXY(String[][] playField, int posi_x, int posi_y) {
        playField[posi_x][posi_y] = "X";
    }

    public static int[] getPlayerPosition(String[][] playField) {

        for (int y = 0; y < playField.length; y++) {

            for (int x = 0; x < playField[y].length; x++) {
                if (playField[y][x].equals("X")) {
                    return new int[] { x, y };
                }
            }
        }

        return new int[] { -1, -1 }; // ['blibla' => 232]

    }

    // Spieler bewegen
    public static void movePlayer(String[][] playField, int oldPosi_x, int oldPosi_y, int newPosi_x, int newPosi_y) {
        playField[oldPosi_y][oldPosi_x] = ".";
        playField[newPosi_y][newPosi_x] = "X";
    }

    // Spieler Ausgeben
    public static void printPlayField(String[][] playField) {

        for (int i = 0; i < playField.length; i++) {
            for (int j = 0; j < playField[i].length; j++) {
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

        int posi_x = getPlayerPosition(playField)[0];
        int posi_y = getPlayerPosition(playField)[1];

        // Spieler bewegen
        movePlayer(playField, posi_x, posi_y, posi_x + 1, posi_y - 1);

        // Spielfeld anzeigen
        printPlayField(playField);

    }
}
