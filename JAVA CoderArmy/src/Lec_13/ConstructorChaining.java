package Lec_13;

public class ConstructorChaining {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNo);
        System.out.println(s1.college);
    }
}

class Student{
    String name;
    int age;
    int rollNo;
    String college;

    Student(){
        this("Unknown");

        System.out.println("I'm in FIRST constructor");
    }

    Student(String name){
        this(name,0);

        System.out.println("I'm in SECOND constructor");
    }

    Student(String name, int age){
        this(name,age,0);

        System.out.println("I'm in THIRD constructor");
    }

    Student(String name, int age, int rollNo){
        this(name,age,rollNo,"Unknown");

        System.out.println("I'm in FOURTH constructor");
    }

    Student(String name, int age, int rollNo, String college){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.college = college;

        System.out.println("I'm in FIFTH constructor");
    }
}
