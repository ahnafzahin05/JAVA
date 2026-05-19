package Class_12_OOP.PizzaBillGenerator;

public class Pizza {
    protected int totalPrice = 0;
    private int veg = 300;
    private int nonVeg = 400;
    private int extraCheese = 100;
    private int extraTopins = 100;
    protected int takeAway = 20;

    Pizza(boolean vegOrNonVeg){
        if(vegOrNonVeg) this.totalPrice+=veg;
        else this.totalPrice+=nonVeg;
    }
}
