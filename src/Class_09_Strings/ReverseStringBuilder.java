package Class_09_Strings;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        String str = "Zahin";
        StringBuilder s = new StringBuilder(str);
        //in-place reverse
        s.reverse(); //O(1)
        System.out.println(s);
        //manual, two pointer technique
        int i=0, j=s.length()-1;
        while(i<=j){ //swap
            char temp1 = s.charAt(i);
            char temp2 = s.charAt(j);
            s.setCharAt(i,temp2);
            s.setCharAt(j,temp1);
            i++; j--;
        }
        System.out.println(s);
        s.deleteCharAt(1);
        System.out.println(s); //Zhin
        s.delete(1,5); //deletes 1 to (j-1)
        System.out.println(s);
    }
}
