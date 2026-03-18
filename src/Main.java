import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // HashSet for Unique Bogie IDs
        HashSet<String> bogieIds = new HashSet<>();

        // ADD (Insert Bogie IDs - including duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // DISPLAY RESULT
        System.out.println("\nBogie IDs after insertion (duplicates ignored):");
        System.out.println(bogieIds);

        System.out.println("\nSystem ensures all bogie IDs are unique.");

        System.out.println("\nSystem ready for further operations...");
    }
}