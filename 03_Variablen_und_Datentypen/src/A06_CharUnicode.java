public class A06_CharUnicode {
    public static void main(String[] args) {

        char zeichen = 'A';
        int code = zeichen;

        /*
         * "\\u steht für Unicode" (einzelner backslash)
         */

        char zeichen1 = '\u0041';
        int code1 = zeichen1;

        System.err.println("Zeichen: " + zeichen);
        System.err.println("Code: " + code);

        System.err.println("Zeichen1: " + zeichen1);
        System.err.println("Code1: " + code1);

    }
}
