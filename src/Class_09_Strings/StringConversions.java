package Class_09_Strings;

public class StringConversions {
    public static void main(String[] args) {
        int n = 500;
//        String s = ""; //empty string
//        s+=n; //stored as string
        //using inbuilt method
//        String s = Integer.toString(n); //important
//        System.out.println(s);

        //String to Int
//        String str = "1010450";
//        int x = Integer.parseInt(str); //Important
//        System.out.println(x+1);

        //String to Char
        String r = "zahin";
        char[] arr = r.toCharArray();
        for(char ele : arr){
            System.out.print(ele+" ");
        }
    }
}
