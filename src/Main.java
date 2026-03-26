import java.util.*;

public class Main {

    // 🔥 Custom Exception Class
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // 🚆 Passenger Bogie Class
    static class PassengerBogie {
        String type;
        int capacity;

        // Constructor with validation
        PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return type + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC14 - Custom Exception Handling ===");

        List<PassengerBogie> bogies = new ArrayList<>();

        // ✅ Valid creation
        try {
            bogies.add(new PassengerBogie("Sleeper", 72));
            bogies.add(new PassengerBogie("AC Chair", 56));
            bogies.add(new PassengerBogie("First Class", 24));
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // ❌ Invalid creation (will throw exception)
        try {
            bogies.add(new PassengerBogie("Invalid Bogie", 0));  // ZERO
        } catch (InvalidCapacityException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        try {
            bogies.add(new PassengerBogie("Invalid Bogie", -10)); // NEGATIVE
        } catch (InvalidCapacityException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        // ✅ Display valid bogies
        System.out.println("\nValid Bogies in Train:");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }
    }
}