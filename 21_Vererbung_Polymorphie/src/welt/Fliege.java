package welt;

public class Fliege extends Insekten {

    public Fliege(String name) {
        super(name, 2);
    }

    @Override
    public void geraeuscheMachen() {
        System.out.println(getName() + " summt leise beim fliegen!");
    }
}
