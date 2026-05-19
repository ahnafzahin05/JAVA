package Class_09_Strings;

public class StringBuildersJava {
    public static void main(String[] args) {
        //if we do new StringBuilder() only then by default it'll have capacity of 16
//        StringBuilder s = new StringBuilder(2); //number defines capacity
//        StringBuilder st = new StringBuilder("zahin"); //capacity = 16 + 5 = 21
//
//        System.out.println(s.length()+" "+s.capacity());
//        System.out.println(st.length()+" "+st.capacity());
//
//        s.append("ahnaf"); //add this to the end of the existing string, think as addToEnd instead of append
//        st.append("ahnaf");
//        System.out.println(s);
//        System.out.println(st);
//        System.out.println(s.length()+" "+s.capacity());
//        System.out.println(st.length()+" "+st.capacity());

        StringBuilder s = new StringBuilder("Zahin");
        s.setCharAt(4,'A');
        System.out.println(s);
        String str = s.toString();
        System.out.println(str);
    }
}
