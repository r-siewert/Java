
class Anzeige {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String ptext) {
        this.text = ptext;
    }
}

public class A04_Setter {
    public static void main(String[] args) {
        Anzeige anzeige = new Anzeige();
        anzeige.setText("was auch immer!");

        System.out.println(anzeige.getText());
    }
}
