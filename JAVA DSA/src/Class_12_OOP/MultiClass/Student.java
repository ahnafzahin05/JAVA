package Class_12_OOP.MultiClass;

public class Student {
    public String name;
    public int ID;
    public Course[] courses = new Course[5];
    //we can't create a string array here, cuz our provided type will be Course. So, lets think the Course class as a
    //new user defined data type, and here you'll create its array to store the courses.
    int courseCount = 0;

    public Student(){}

    public Student(String name, int ID){
        this.name = name;
        this.ID = ID;
    }

    public void addCourse(Course c){
        courses[courseCount++] = c;
    }

    public void printDetails(){
        System.out.println("Student Name: "+name);
        System.out.println("Student ID: "+ID);
        System.out.println("Courses Taken: "+courseCount);

        for(int i=0; i<courseCount; i++){
            System.out.println(i+1);
            System.out.println(courses[i].courseCode);
            System.out.println(courses[i].courseTitle);
        }
    }
}
