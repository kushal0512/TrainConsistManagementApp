import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // LinkedList for Train Consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // ADD (Initial Bogies)
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // INSERT (Middle)
        System.out.println("\nInserting 'Pantry Car' at position 2...");
        trainConsist.add(2, "Pantry Car");

        System.out.println("After Insertion:");
        System.out.println(trainConsist);

        // REMOVE (First and Last)
        System.out.println("\nRemoving first and last bogies...");
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // FINAL STATE
        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);

        System.out.println("\nSystem ready for further operations...");
    }
}