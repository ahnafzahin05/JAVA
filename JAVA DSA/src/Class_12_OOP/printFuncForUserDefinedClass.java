package Class_12_OOP;

public class printFuncForUserDefinedClass {

    public static class StudentDetails{
        String name;
        int Class;
        String Location;
        int salary;

        void print(){ //ei method ta hocche ekta class er nijossho/specific identity
            System.out.println("Name: "+name);
            System.out.println("Class: "+Class);
            System.out.println("Location: "+Location);
            System.out.println("Salary: "+salary);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StudentDetails Mahir = new StudentDetails();
        Mahir.name = "MAHIR ABRAR";
        Mahir.Class = 12;
        Mahir.Location = "Mirpur-2";
        Mahir.salary = 6000;

        StudentDetails Aifa = new StudentDetails();
        Aifa.name = "AIFA";
        Aifa.Class = 10;
        Aifa.Location = "Desco, Mirpur-13";
        Aifa.salary = 7000;

        Mahir.print();
        Aifa.print();
    }
}
