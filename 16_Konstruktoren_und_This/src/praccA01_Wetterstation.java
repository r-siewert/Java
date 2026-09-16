class Wetterstation {
    String status;

    Wetterstation() {
        status = "online";
    }
}

public class praccA01_Wetterstation {
    public static void main(String[] args) {

        Wetterstation wetterstation = new Wetterstation();

        System.out.println("Wetterstation: " + wetterstation.status);
    }
}
