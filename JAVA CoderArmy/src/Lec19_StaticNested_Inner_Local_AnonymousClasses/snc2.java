package Lec19_StaticNested_Inner_Local_AnonymousClasses;

public class snc2 {
    public static void main(String[] args) {

    }
}

class BankAccount{

    private static class InterestCalculator{
        static double calculateYearly(double p, double r){
            return p*r;
        }
    }

    public double computeInterest(double principal){
        return InterestCalculator.calculateYearly(principal,0.09);
    }
}

// Use cases of static nested classes:
// Helper function for any outer class
// Builder Design Pattern
// If you want to have static methods inside a nested class
// Request/Response DTO
