package bewegung;

import java.util.Scanner;

public class move_5 {

    // spielfeld erstellen
    public static void createPlayField(String[][] playField) {
        for (int i = 0; i < playField.length; i++) {
            for (int j = 0; j < playField[i].length; j++) {
                playField[i][j] = ".";
            }
        }
    }

    // spieler setzen
    public static void setPlayerPositionXY(String[][] playField, int posi_x, int posi_y) {
        playField[posi_x][posi_y] = "X";
    }

    public static int[] getPlayerPositon(String[][] playField) {
        for (int y = 0; y < playField.length; y++) {
            for (int x = 0; x < playField[y].length; x++) {
                if (playField[y][x].equals("X")) {
                    return new int[] { x, y };
                }
            }
        }

        return new int[] { -1, -1 };
    }

    // Spieler nach links bewegen
    public static void moveLeft(String[][] playField, int step) {
        int posi_x = getPlayerPositon(playField)[0];
        int posi_y = getPlayerPositon(playField)[1];

        playField[posi_y][posi_x] = ".";
        playField[posi_y][posi_x - step] = "X";

    }

    // Spieler nach Rechts bewegen
    public static void moveRight(String[][] playField, int step) {
        int posi_x = getPlayerPositon(playField)[0];
        int posi_y = getPlayerPositon(playField)[1];

        playField[posi_y][posi_x] = ".";
        playField[posi_y][posi_x + step] = "X";

    }

    // Spieler nach Oben bewegen
    public static void moveUp(String[][] playField, int step) {
        int posi_x = getPlayerPositon(playField)[0];
        int posi_y = getPlayerPositon(playField)[1];

        playField[posi_y][posi_x] = ".";
        playField[posi_y - step][posi_x] = "X";

    }

    // Spieler nach Unten bewegen
    public static void moveDown(String[][] playField, int step) {
        int posi_x = getPlayerPositon(playField)[0];
        int posi_y = getPlayerPositon(playField)[1];

        playField[posi_y][posi_x] = ".";
        playField[posi_y + step][posi_x] = "X";

    }

    // spieler bewegen
    // public static void movePlayer(String[][] playField, int oldPosi_x, int
    // oldPosi_y, int newPosi_x, int newPosi_y) {
    // playField[oldPosi_y][oldPosi_x] = ".";
    // playField[newPosi_y][newPosi_x] = "X";
    // }

    static void konsoleLoeschen() {
        System.out.print("\033[2J\033[3J\033[H");
        System.out.flush();
    }

    // spielfeld ausgeben
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

        konsoleLoeschen();

        // spielfeld erstellen
        createPlayField(playField);

        // spieler setzen
        setPlayerPositionXY(playField, 2, 2);

        // spielfeld ausgeben
        printPlayField(playField);

        Scanner scanner = new Scanner(System.in);
        String eingabe = "";

        while (!eingabe.equals("0")) {

            // aktuelle position des Spileres abrufen

            System.out.println("Spielerbewegung: 'w' oben, 'a' links, 's' rueckwaerts, 'd' rechts");

            eingabe = scanner.nextLine();

            switch (eingabe) {
                case "w":
                    moveUp(playField, 1);
                    break;

                case "s":
                    moveDown(playField, 1);
                    break;

                case "a":
                    moveLeft(playField, 1);
                    break;

                case "d":
                    moveRight(playField, 1);
                    break;
            }
            konsoleLoeschen();
            // spielfeld ausgeben
            printPlayField(playField);
        }

        scanner.close();

    }
}