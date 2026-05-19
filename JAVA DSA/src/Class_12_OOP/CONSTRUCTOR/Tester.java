package Class_12_OOP.CONSTRUCTOR;

public class Tester {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);

        Student s2 = new Student("Adiba",3);
        System.out.println(s2.name+" "+s2.id);
    }
}
