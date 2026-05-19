package Class_12_OOP;

class Stu{
    String name;
    private int Roll;
    double cg;
    //we use getter and setter for private properties
    int getRoll(){ //getter
        return Roll;
    }
    void setRoll(int x){
        Roll = x;
    }
}

public class getterSetter {
    public static void main(String[] args) {
        Stu s1 = new Stu();
        System.out.println(s1.getRoll());
        s1.setRoll(1000057642);
        System.out.println(s1.getRoll());
    }
}
