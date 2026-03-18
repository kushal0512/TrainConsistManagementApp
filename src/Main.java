import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Dynamic ArrayList for Passenger Bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // CREATE (Add Bogies)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // READ (Display Bogies)
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // DELETE (Remove a Bogie)
        System.out.println("\nRemoving 'AC Chair' bogie...");
        passengerBogies.remove("AC Chair");

        // CHECK (Existence Check)
        System.out.println("\nChecking if 'Sleeper' exists...");
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present in the train.");
        } else {
            System.out.println("Sleeper bogie is NOT present in the train.");
        }

        // FINAL STATE
        System.out.println("\nFinal Passenger Bogies:");
        System.out.println(passengerBogies);

        System.out.println("\nSystem ready for further operations...");
    }
}