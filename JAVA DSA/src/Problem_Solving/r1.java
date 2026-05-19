package Problem_Solving;

public class r1 {
    public static void main(String[] args) {
        String s = "madrid city madrid madrid city";
        String word = "madrid";

        int count = 0;
        int idx = s.indexOf(word);

        while (idx != -1) {
            count++;
            idx = s.indexOf(word, idx + word.length());
        }

        System.out.println(count); // 3

    }
}
