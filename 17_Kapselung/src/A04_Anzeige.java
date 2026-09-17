
class Anzaige {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String ptext) {
        this.text = ptext;
    }
}

public class A04_Anzeige {
    public static void main(String[] args) {
        Anzaige anzeige = new Anzaige();
        anzeige.setText("was auch immer!");

        System.out.println(anzeige.getText());
    }
}
