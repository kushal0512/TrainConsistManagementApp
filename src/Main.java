import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // LinkedHashSet for Ordered + Unique Train Formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // ADD (Attach Bogies)
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt Duplicate
        System.out.println("\nAttempting to add duplicate 'Sleeper'...");
        trainFormation.add("Sleeper"); // will be ignored

        // DISPLAY FINAL FORMATION
        System.out.println("\nFinal Train Formation (Order Preserved, No Duplicates):");
        System.out.println(trainFormation);

        System.out.println("\nSystem ready for further operations...");
    }
}