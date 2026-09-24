package welt;

public class A01_WeltDemo {
    public static void main(String[] args) {
        Hund rex = new Hund("Rex");
        Katze kitty = new Katze("Kitty");

        rex.geraeuscheMachen();

        System.out.println("Beine: " + rex.getBeineAnzahl());

        System.out.println("Beine: " + kitty.getBeineAnzahl());

        kitty.geraeuscheMachen();

        Fliege puk = new Fliege("Puk");

        puk.geraeuscheMachen();
        System.out.println("Flügel: " + puk.getFluegelAnzahl());

        Biene maja = new Biene("Maja");
        maja.geraeuscheMachen();
        System.out.println("Flügel " + maja.getFluegelAnzahl());
    }
}
