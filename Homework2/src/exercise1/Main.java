package exercise1;

public class Main {
    public static void main(String[] args) {

        Textbook t1 = new Textbook("Data Structures", 2020, "Jane Doe", "Computer Sience");
        System.out.println(t1.getInfo());

        Textbook t2 = new Textbook("Chroniken", 2024, "Sarah Moos", "Fantasy");
        System.out.println(t2.getInfo());

        

    }
}