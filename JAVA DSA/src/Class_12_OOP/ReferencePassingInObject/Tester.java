package Class_12_OOP.ReferencePassingInObject;

public class Tester {
    public static void main(String[] args) {
        Student s1 = new Student("Zahin",10);
        Student s2 = new Student("Ahnaf",5);

        s1.makeCall(s2);
    }
}
 