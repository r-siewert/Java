package uebungen.src;

class Punkt {
    int x;
    int y;

    public void verhalten(int px, int py) {
        x = x + px;
        y = y + py;
    }
}

public class A04_Punkt {
    public static void main(String[] args) {
        Punkt punkt = new Punkt();

        punkt.x = 2;
        punkt.y = 3;

        punkt.verhalten(4, -1);

        System.out.println("Position: " + punkt.x + ", " + punkt.y);
    }
}
