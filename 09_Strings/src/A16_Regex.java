public class A16_Regex {
 public static void main(String[] args) {
    
    String email = "user@example.com";

    String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,3}";
    // String regex = "^[A-Za-z0-9]{5,6}$";"

    if(email.matches(regex)){
        System.out.println("Gültige Email: " + email);
    } else {
        System.out.println("Ungültige Email: " + email);
    }



 }
}
