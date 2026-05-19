package Class_12_OOP;

class Cricketer{
    final String country = "Bangladesh"; //never be changed, creates new box/index for every object with same value
    static String nationality = "Pakistani"; //common property of all objects, can be changed, single var for the class, no other box/index for every object
    final static String religion = "Muslim"; //common property of all objects, can never be changed, single var for the class
    int runs;
    String name;
    double avg;
}

public class finalANDstatic {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        //c1.country = "Pakistan"; //Not Possible
        System.out.println(c1.country);

        Cricketer c2 = new Cricketer();
        Cricketer.nationality = "Bangladeshi";
        System.out.println(c1.nationality);
        System.out.println(c2.nationality);
    }
}
