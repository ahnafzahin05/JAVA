package Class_09_Strings;

public class ChangetheString {
    public static void main(String[] args) {
        String s = "aHnaf ZAhIn";
        int ascii = (int)s.charAt(0);
        if(ascii<97) System.out.println(s.toUpperCase());
        else System.out.println(s.toLowerCase());

    }
}
