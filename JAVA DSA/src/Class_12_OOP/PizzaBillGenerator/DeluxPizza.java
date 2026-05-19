package Class_12_OOP.PizzaBillGenerator;

public class DeluxPizza extends Pizza{
    private int veg = 500;
    private int nonVeg = 600;

    DeluxPizza(boolean vegOrNonVeg){
        super(vegOrNonVeg);

        if(vegOrNonVeg) this.totalPrice+=veg;
        else this.totalPrice+=nonVeg;
    }

}
