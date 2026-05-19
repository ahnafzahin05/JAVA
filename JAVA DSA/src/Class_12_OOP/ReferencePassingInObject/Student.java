package Class_12_OOP.ReferencePassingInObject;

public class Student {
    public String name;
    public int id;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void makeCall(Student x){
        System.out.println("Hey "+x.name+", I'm "+name+" from your class. SIR IS CALLING YOU!");
        System.out.println(x);
    }
}
