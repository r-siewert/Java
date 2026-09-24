package welt;

public class A02_WeltDemo {

    public static void main(String[] args) {
        Lebewesen[] welt = {
                new Hund("Rex"),
                new Katze("Kitty"),
                new Fliege("Puk"),
                new Biene("Maja")
        };

        for (Lebewesen lebewesen : welt) {
            lebewesen.geraeuscheMachen();

            if (lebewesen instanceof Tiere) {

                Tiere tier = (Tiere) lebewesen;

                System.out.println("-> ist ein Tier mit " + tier.getBeineAnzahl() + " Beinen!");

            } else if (lebewesen instanceof Insekten) {
                Insekten insekt = (Insekten) lebewesen;
                System.out.println("-> ist ein Insekt mit: " + insekt.getFluegelAnzahl() + " Fluegel!");
            }

        }
    }

}
