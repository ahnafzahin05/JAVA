package Class_12_OOP.MultiClass;

public class Tester {
    public static void main(String[] args) {
        Course c1 = new Course("CSE111","OOP");
        Course c2 = new Course("CSE230","Discrete Mathematics");
        Student s1 = new Student("Ahnaf Zahin",1000057642);

        s1.addCourse(c1);
        s1.addCourse(c2);
        s1.printDetails();
    }
}
