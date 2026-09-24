package welt;

public class Lebewesen {

    private String name;

    public Lebewesen(String name) {
        this.name = name;
    }

    public void geraeuscheMachen() {
        System.out.println(name + " macht geraeusche!");
    }

    public String getName() {
        return name;
    }

}
