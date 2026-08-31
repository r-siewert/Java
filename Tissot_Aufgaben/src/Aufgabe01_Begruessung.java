public class Aufgabe01_Begruessung {
    public static void main(String[] args) {
        String name = "Hans";
        String nachname = "Wurst";
        
        StringBuilder ganzerName = new StringBuilder();

        ganzerName.append(name);
        ganzerName.append(" ");
        ganzerName.append(nachname);
        System.out.println(ganzerName); 

      

    

        StringBuilder begruessung = new StringBuilder();

        begruessung.append("Hallo ");
        begruessung.append(ganzerName);
        begruessung.append("!");

        System.out.println(begruessung);

        System.out.println(begruessung.toString());
    }
}
