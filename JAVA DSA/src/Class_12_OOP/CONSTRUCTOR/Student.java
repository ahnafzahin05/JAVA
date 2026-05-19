package Class_12_OOP.CONSTRUCTOR;


public class Student {
    public String name;
    public int id;

    public Student(){} //Non-parameterized / Default constructor

    public Student(String name, int id){ //Parameterized Constructor
        this.name = name;
        this.id = id;
    }
}
