package welt;

public class Katze extends Tiere {
    Katze(String name) {
        super(name, 4);
    }

    @Override
    public void geraeuscheMachen() {
        System.out.println(getName() + " miauzt: Miau!");
    }

}