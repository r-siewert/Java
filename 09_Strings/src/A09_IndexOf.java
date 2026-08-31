public class A09_IndexOf {
    public static void main(String[] args) {

                    // 0123456789 
        String text = "Programm-Programmierer";
        System.out.println(text.indexOf("gram")); //3
        System.out.println(text.indexOf("gram")); //5

        System.out.println(text.indexOf("Programm", 0)); //0
        System.out.println(text.indexOf("Programm", 1)); //9
        System.out.println(text.indexOf("gramm", 17)); //-1
    }
}
