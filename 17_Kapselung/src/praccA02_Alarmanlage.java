import java.util.Scanner;

class Alarmanlage {
    private boolean scharfStatus = false;

    public void scharfMachen() {
        this.scharfStatus = true;
    }

    public void entschaerfen() {
        this.scharfStatus = false;
    }

    public boolean getStatus() {
        return this.scharfStatus;
    }
}

public class praccA02_Alarmanlage {
    public static void main(String[] args) {

        Alarmanlage alarmanlage = new Alarmanlage();
        Scanner scanner = new Scanner(System.in);

        String eingabe = scanner.nextLine();

        if (eingabe.equals("einschalten")) {
            alarmanlage.scharfMachen();
        } else {
            alarmanlage.entschaerfen();
        }

        System.out.println("Status Alarmanlage: " + alarmanlage.getStatus());

        scanner.close();
    }
}
