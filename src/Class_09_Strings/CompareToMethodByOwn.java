package Class_09_Strings;

public class CompareToMethodByOwn {
    public static void main(String[] args) {
        String a = "harshab";
        String b = "harsh";
        System.out.println(compare(a,b));
    }
    public static int compare(String a, String b){
        int na = a.length();
        int nb = b.length();
        for(int i=0; i<na && i<nb; i++){ //loop will iterate till the smallest length between the two string
            if(a.charAt(i) != b.charAt(i)) {
                return a.charAt(i) - b.charAt(i);
            }
        }
        return na - nb;
    }
}
