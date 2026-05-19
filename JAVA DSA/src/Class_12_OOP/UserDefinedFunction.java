package Class_12_OOP;

public class UserDefinedFunction {
    public static class Student{
        String name;
        int id;
        double cgpa;
    }

    public static void main(String[] args) {
        Student s1 = new Student(); //declaration
        s1.name = "Ahnaf";
        s1.id = 1000057642;
        s1.cgpa = 3.6;

        Student s2 = new Student(); //declaration
        s2.name = "Nahian";
        s2.id = 1000057655;
        s2.cgpa = 3.75;

        System.out.println(s1.name+" "+s1.id+" "+s1.cgpa);
    }
}
