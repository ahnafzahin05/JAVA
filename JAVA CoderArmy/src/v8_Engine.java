import java.util.Scanner;

public class v8_Engine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        char firstChar = input.charAt(12);

        if(firstChar=='"'){
            String output = input.substring(13,input.length()-2);
            System.out.println(output);
        }
        else{
            int a = Integer.parseInt(String.valueOf(input.charAt(12)));
            int b = Integer.parseInt(String.valueOf(input.charAt(14)));
            char operator = input.charAt(13);

            if(operator=='+') System.out.println(a+b);
            else if(operator=='-') System.out.println(a-b);
            else if(operator=='*') System.out.println(a*b);
            else if(operator=='/') System.out.println(a/b);
        }
    }
}
