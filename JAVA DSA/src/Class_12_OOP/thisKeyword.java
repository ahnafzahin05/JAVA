package Class_12_OOP;

public class thisKeyword {
    private static class Car{
        String name;
        int price;
        //we can always use this keyword. it is better to use this always inside class
        //this keyword refers to the objects parameters that has been called
        Car(String name, int price){
            this.name = name;
            this.price = price;
        }

        void print(){
            System.out.println(this.name+" "+this.price);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car("Allion",2000000);
        c1.print();
    }
}
