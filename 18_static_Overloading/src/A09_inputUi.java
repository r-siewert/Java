import javax.swing.JOptionPane;

public class A09_inputUi {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Gebe deinen Namen ein: ");
        String nname = JOptionPane.showInputDialog("Gebe deinen Nachnamen ein: ");

        System.out.println("Ich heiße: " + name + " - " + nname);
    }
}
