package Class_12_OOP.YouTubePlaylist;

public class driver {
    public static void main(String[] args) {
        YouTubePlaylist p1 = new YouTubePlaylist();
        System.out.println("1----------------");
        p1.details();
        System.out.println("2----------------");
        p1.uploadVideo("Java Basics");
        p1.uploadVideo("OOP Basics");
        p1.uploadVideo("Instance Method");
        p1.uploadVideo("Overloading");
        System.out.println("2----------------");
        p1.details();
        System.out.println("3----------------");
        p1.uploadVideo("Constructor");
        System.out.println("4----------------");
        p1.removeVideo("OOP Basics");
        System.out.println("5----------------");
        p1.removeVideo("Inheritance");
        System.out.println("6----------------");
        p1.details();
        System.out.println("7----------------");
        System.out.println(p1.changeVisibility("Java Basics", "Private"));
        System.out.println("8----------------");
        p1.details();
    }
}
