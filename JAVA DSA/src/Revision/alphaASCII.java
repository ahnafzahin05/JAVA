package Revision;

import java.util.Scanner;

public class alphaASCII {
    public static void main(String[] args) {
        int p = 65;
        for(int i=1; i<=26; i++){
            System.out.println((char)p + " " + p++);
        }
    }
}
