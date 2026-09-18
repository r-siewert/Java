class Punktestand {
    private int punkte;

    public void setPunkte(int ppunkte) {
        if (ppunkte > 0) {
            this.punkte = ppunkte;
        } else {
            this.punkte = 0;
        }
    }

    public int getPunkte() {
        return punkte;
    }
}

public class A06_SetterAblehnen {
    public static void main(String[] args) {
        Punktestand punktestand = new Punktestand();

        punktestand.setPunkte(50);

        System.out.println("Punktestand: " + punktestand.getPunkte());

        punktestand.setPunkte(-60);

        System.out.println("Punktestand: " + punktestand.getPunkte());

    }

}
