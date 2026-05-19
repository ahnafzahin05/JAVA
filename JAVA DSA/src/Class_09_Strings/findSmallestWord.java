package Class_09_Strings;

import java.util.Scanner;

public class findSmallestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(smallestWord(s));
    }

    private static String smallestWord(String s) {
        String ans = "";
        String temp = "";
        int min = Integer.MAX_VALUE;
        int i=0, j=0;
        while(j<s.length()){
            if(s.charAt(j) == ' '){
                if(j-i < min && temp.length()>0){
                    min = j-i;
                    ans = temp;
                }
                temp = "";
                i = j+1;
            }
            else temp+=s.charAt(j);
            j++;
        }
        if(j-i < min && temp.length()>0){
            min = j-i;
            ans = temp;
        }
        return ans;

        //OPTIMIZED VERSION
//        String ans = "";
//        String temp = "";
//        int min = Integer.MAX_VALUE;
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) != ' ') {
//                temp += s.charAt(i);
//            } else { //just ekta var 'i' newar reason hocche amar temp jokhn create hocche, tokhn to amra temp.length() diyei
//                // temp er lenght ta ber korte parbo taina? jeita amra actually (j-i) diye korte chacchilam,
//                // eikhane j lagtesena cuz string er length method diyei ber kora jay, but array er khetre tokhn
//                // length ber korar jonno duita pointer lagte parto

//                if (temp.length() > 0 && temp.length() < min) {
//                      temp er length zero hote parbena cuz string e multiple
//                    // spaces thakle tokhn space keo string banaye felbe temp, but we don't need spaces as temp string
//                    min = temp.length();
//                    ans = temp;
//                }
//                temp = ""; // reset for next word
//            }
//        }
//
//        // check the last word (if string doesn’t end with space)
//        if (temp.length() > 0 && temp.length() < min) {
//            ans = temp;
//        }
//
//        return ans;
    }
}
