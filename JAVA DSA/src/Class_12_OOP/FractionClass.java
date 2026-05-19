package Class_12_OOP;

class Fraction{
    int num, deno;

    Fraction(){}
    Fraction(int num, int deno){
        this.num = num; this.deno = deno;
        simplify();
    }

    void print(){
        System.out.println(num+"/"+deno);
    }

    void add(Fraction f){
        int a = this.num, b = this.deno, c = f.num, d = f.deno;

        this.num = a*d + c*b;
        this.deno = b*d;

        simplify();;
    }

    void multiply(Fraction f){
        this.num = this.num*f.num;
        this.deno = this.deno*f.deno;
        simplify();
    }

    void simplify(){
        int gcd = hcf(num, deno);
        num = num/gcd;
        deno = deno/gcd;

        if(num<0 && deno<0){
            num = -num; deno = -deno;
        }
        else if(deno<0){
            num = -num;
            deno = -deno;
        }
    }

    int hcf(int a, int b){
        if(a==0) return b;
        return hcf(b%a,a);
    }
}

public class FractionClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,-5);
        Fraction f2 = new Fraction(-5,3);
        Fraction f3 = new Fraction(5,2);
        Fraction f4 = new Fraction(-6,-2);
        f2.add(f1);
        f2.print();
    }
}
