package Class_12_OOP;

import java.util.Arrays;

public class ConstructorUseMarks {
    public static class StudentData{
        String name;
        int Roll;
        int[] marks;

        StudentData(int s){
            marks = new int[s];
        }

    }

    public static void main(String[] args) {
        StudentData s1 = new StudentData(3);
        s1.marks = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(s1.marks));
    }
}
