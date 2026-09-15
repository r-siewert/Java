
class Roboter {
    String status;

    Roboter() {
        status = "bereit";
    }
}

public class A01_EigenerKonstruktor {
    public static void main(String[] args) {

        Roboter roboter = new Roboter();
        System.out.println("Status: " + roboter.status);

    }
}
