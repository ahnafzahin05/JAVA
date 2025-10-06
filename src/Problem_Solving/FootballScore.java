package Problem_Solving;

import java.util.Scanner;

public class FootballScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalGame = sc.nextInt();
        int aScore = 0, bScore = 0;
        double aWin = 0;
        for(int i=1; i<=totalGame; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a-b>0) {
                aScore+=3;
                aWin++;
            }
            else if(a-b==0) {
                aScore++;
                bScore++;
            }
            else bScore+=3;
        }
        System.out.println("Total points: " + aScore);
        double percent = (aWin/totalGame)*100;
        System.out.println("Winning percentage: "+ percent + "%");
    }
}
