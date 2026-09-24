package welt;

public class Hund extends Tiere {
    Hund(String name) {
        super(name, 4);
    }

    @Override
    public void geraeuscheMachen() {
        System.out.println(getName() + " bellt: Wuff!");
    }

}