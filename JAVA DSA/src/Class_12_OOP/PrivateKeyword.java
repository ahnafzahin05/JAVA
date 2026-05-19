package Class_12_OOP;

class Students{
    String name; //null
    private int roll = 2026; //lets day we wanna keep this value by default
    double cgpa;

    void print1(){
        System.out.println(name+" "+roll+" "+cgpa);
    }

    private void print2(){
        System.out.println(name);
    }

    void p(){
        print2(); //this way we can access a private method/var and make it able to access outside the class as well
    }
}
public class PrivateKeyword {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Ahnaf";
        s1.cgpa = 3.6;

        s1.print1();
        s1.p(); //we can't access the p() function out here as it is private, so now we create another function
        //name print2() inside the class and called that private func p() inside print2()
    }
}
