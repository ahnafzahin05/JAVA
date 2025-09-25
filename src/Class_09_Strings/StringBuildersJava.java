package Class_09_Strings;

public class StringBuildersJava {
    public static void main(String[] args) {
//        StringBuilder s = new StringBuilder(6);
//        StringBuilder st = new StringBuilder("zahin");
//        System.out.println(s.length()+" "+s.capacity());
//        System.out.println(st.length()+" "+st.capacity());
//        s.append("ahnaf");
//        st.append("ahnaf");
//        System.out.println(s.length()+" "+s.capacity());
//        System.out.println(st.length()+" "+st.capacity());

        StringBuilder s = new StringBuilder("Zahin");
        s.setCharAt(4,'A');
        System.out.println(s);
        String t = s.toString();
        System.out.println(t);
    }
}
