package Lec18_AutoBoxing_AbstractClasses_POJOs;

public class autoboxingUnboxing {
    public static void main(String[] args) {
        //Autoboxing: primitive --> Non-primitive
        //Unboxing: Non-primitive --> Primitive

        //Autoboxing is required when you need to convert a primitive data type (like int, char, or double) into its
        //corresponding object wrapper class (like Integer, Character, or Double)

        // Instead of explicitly boxing: numbers.add(Integer.valueOf(5));
        // List<Integer> numbers = new ArrayList<>();
        // numbers.add(5); // Autoboxing occurs here

        int x = 10;
        Integer y = x; //autoboxing
        //This is what JAVA does internally: Integer y = Integer.valueOf(x);

        System.out.println(x);
        System.out.println(y); //unboxing
        //printing an object gives you the reference/address, but why is it giving you the integer value of  x?
        //This is what JAVA does internally: System.out.println(y.intValue()); This intValue() is like a getMethod in Integer class

        // ## Where and When autoboxing and unboxing is applied?
        // Assignment, Method calls, Arithmetic ops
    }
}
