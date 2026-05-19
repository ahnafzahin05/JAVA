package Class_12_OOP;

public class PassingObjectToMethod {

    public static class University{
        String name;
        String location;
        String type;
        String[] subjects;
        int cost;
        int ranking;
        double avgCG;
    }

    public static void main(String[] args) {
        University myUni = new University();
        myUni.name = "Brac University";
        myUni.location = "Merul Badda";
        myUni.type = "Private University";
        myUni.subjects = new String[]{"CSE", "CS", "EEE", "BioTech", "Economics", "BBA"};
        myUni.cost = 15;
        myUni.ranking = 1000;
        myUni.avgCG = 3.00;

        System.out.println(myUni.ranking);
        change(myUni); //passing the object [passed by reference]
        System.out.println(myUni.ranking);

    }

    private static void change(University myUni) {
        myUni.ranking = 2000;
    }


}
