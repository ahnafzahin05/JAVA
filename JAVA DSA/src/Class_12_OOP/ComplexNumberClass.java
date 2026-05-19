package Class_12_OOP;

class ComplexNumber{
    double x, y;

    //Constructor
    ComplexNumber(){}
    ComplexNumber(double x, double y){
        this.x = x; this.y = y;
    }

    //Methods
    void print(){
        if(y>0) System.out.println(x+" + "+y+"i");
        else if(y<0) System.out.println(x+" - "+(-y)+"i");
        else System.out.println(x);
    }

    void add(ComplexNumber z){
        this.x += z.x; //suppose the call is z2.add(z1), here this.x and this.y refers to the x and y of z2
        this.y += z.y;
    }

    void multiply(ComplexNumber z){
        double a = this.x, b = this.y, c = z.x, d = z.y;
        this.x = a*c - b*d;
        this.y = a*d + b*c;
    }

    void divide(ComplexNumber z){
        double a = this.x, b = this.y, c = z.x, d = z.y;
        this.x = (a*c + b*d)/(c*c + d*d);
        this.y = (b*c - a*d)/(c*c + d*d);
    }
}

public class ComplexNumberClass {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(2,5);
        ComplexNumber z2 = new ComplexNumber(2,-5);
        ComplexNumber z3 = new ComplexNumber(-2,5);
        ComplexNumber z4 = new ComplexNumber(-2,-5);
        z1.print(); z2.print(); z3.print(); z4.print();

        //z2.add(z1); //this means - z2 er moddhe z1 ke add kore diye new z2 deo
//        z1.multiply(z2);
//        z1.print();
        z1.divide(z2);
        z1.print();

    }
}
