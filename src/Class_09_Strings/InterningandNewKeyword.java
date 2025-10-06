package Class_09_Strings;

public class InterningandNewKeyword {
    public static void main(String[] args) {
        String s = "zahin";
        String t = "zahin"; //only one string "zahin" is created in the memory and both s and t is pointing it
        String a = new String("zahin"); //using this method, a new string "zahin" is created, so there are two strings named "zahin"
        //one can be accessible by s or t, and the other one using 'a'.

        //changing string using substring
        String str = "Ahnaf"; //suppose we wanna print AhnZahinaf
        str = str.substring(0,3) + "Zahin" + str.substring(3);
        System.out.println(str);
    }
}
