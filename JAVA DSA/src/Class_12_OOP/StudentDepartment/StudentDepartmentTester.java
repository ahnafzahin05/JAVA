package Class_12_OOP.StudentDepartment;

public class StudentDepartmentTester {
    public static void main(String[] args) {
        Student s1 = new Student("Akib", 10, 3.29);
        Student s2 = new Student("Reza", 15, 3.45);
        Student s3 = new Student("Kabir", 20,4.0);
        System.out.println("1===========");
        Department cse = new Department("CSE");
        cse.findStudent(-100);
        System.out.println("2===========");
        cse.addStudent(s1, s2, s3);
        System.out.println("3===========");
        cse.details();
        System.out.println("4===========");
        cse.findStudent(15);
        System.out.println("5===========");
        Student s4 = new Student("Nakib", 15,3.22);
        cse.addStudent(s4);
        System.out.println("6===========");
        s4.setId(25);
        cse.addStudent(s4);
        System.out.println("7===========");
        cse.details();
        System.out.println("8===========");
        Student s5 = new Student("Sakib", 30,2.29);
        cse.addStudent(s5);
        System.out.println("9===========");
        cse.details();

    }
}

class Student{
    String name;
    private int id;
    double cgpa;

    Student(String name, int id, double cgpa){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    int getId(){
        return id;
    }

    void setId(int id){
        this.id = id;
    }
}

class Department{
    String deptName;
    Student[] students = new Student[5];
    int count = 0;

    Department(String deptName){
        this.deptName = deptName;
    }

    void addStudent(Student s){
        if(count<5){
            boolean isPresent = false;

            for(int i=0; i<count; i++){
                if(students[i].getId()==s.getId()){
                    isPresent = true;
                    break;
                }
            }

            if(isPresent) System.out.println("Student with the same ID already exists, Please try with another ID");
            else{
                students[count++] = s;
                System.out.println("Welcome to "+deptName+" department, "+s.name);
            }
        }
        else System.out.println("Cannot add more than 5 students.");
    }

    void addStudent(Student s1, Student s2, Student s3){
        addStudent(s1);
        addStudent(s2);
        addStudent(s3);
    }

    void findStudent(int id){
        boolean isPresent = false;
        int idx = -1;

        for(int i=0; i<count; i++){
            if(students[i].getId()==id){
                isPresent = true;
                idx = i;
                break;
            }
        }

        if(isPresent){
            System.out.println("Student info: ");
            System.out.println("Student Name: "+students[idx].name);
            System.out.println("ID: "+students[idx].getId());
            System.out.println("CGPA: "+students[idx].cgpa);
        }
        else System.out.println("Student with this ID doesn't exist, Please give a valid ID");
    }

    void details(){
        System.out.println("Department Name: "+deptName);
        System.out.println("Number of student: "+count);
        System.out.println("Details of the students: ");
        for(int i=0; i<count; i++) System.out.println("Student name: "+students[i].name+", ID: "+students[i].getId()+", cgpa: "+students[i].cgpa);
    }
}
