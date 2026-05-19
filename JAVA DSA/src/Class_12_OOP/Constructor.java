package Class_12_OOP;

public class Constructor {
    public static class Car{
        int seats;
        String name;
        double length;

        Car(){ //non-parameterized/default constructor, eita na create korleo hidden thake and jokhn new object create kori tokhn use hoy
            //when we created another constructor with parameter, but in the main func we want to assign values in both
            //the way i.e c1.name = "Zahin"; and Car c2 = new Car(, ,); then we've to manually create the default zero
            //parameter constructor.. cuz the default hidden parameter won't be accessible after we create personalized
            //parameterized constructor
            //this process is called constructor overloading i.e constructors of same name with different parameter numbers
        }

        Car(int x, String s, double l){ //parameterized constructor
            seats = x;
            name = s;
            length = l;
        }

        void print(){
            System.out.println(seats+" "+name+" "+length);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car(5, "Toyota Allion", 3.8);
        c1.print();
        Car c2 = new Car(7, "Toyota Harrier", 4.2);
        c2.print();
        Car c3 = new Car();
        c3.seats = 7;
        c3.name = "NOAH";
        c3.length = 4.4;
        c3.print();
    }
}
