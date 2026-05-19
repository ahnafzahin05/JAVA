package Class_09_Strings;

public class PrintAllSubstrings {
    public static void main(String[] args) {
        String s = "zahin";
        int n = s.length();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                System.out.print(s.substring(i,j)+" "); //prints from i to (j-1)
            }
            System.out.println();
        }
    }
}
