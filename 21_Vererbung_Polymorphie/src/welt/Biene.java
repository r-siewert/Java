package welt;

public class Biene extends Insekten {

    public Biene(String name) {
        super(name, 4);
    }

    @Override
    public void geraeuscheMachen() {
        System.out.println(getName() + " ist fleißig und summt dabei herum!");
    }
}
