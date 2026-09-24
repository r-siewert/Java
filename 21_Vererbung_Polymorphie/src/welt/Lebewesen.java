package welt;

public class Lebewesen {

    private String name;

    public Lebewesen(String name) {
        this.name = name;
    }

    public void geraeusche() {
        System.out.println(name + " macht geraeusche!");
    }

}
