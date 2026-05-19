package Class_12_OOP.MethodOverloading;

public class Dog {
    public String name;
    public String[] n;

    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }

    public void eat(String food, int amount){
        System.out.println(name+" is eating "+amount+" "+food+"'s");
    }
}
