import java.util.*;
import java.util.stream.*;

public class Main {

    // Bogie class
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (" + capacity + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC10 - Total Seating Capacity ===");

        // Reuse list (same style as UC7, UC8, UC9)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("First Class", 24));

        // Display bogies
        System.out.println("\nBogies:");
        bogies.forEach(System.out::println);

        // 🔥 AGGREGATION USING STREAM
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)          // extract capacity
                .reduce(0, Integer::sum);     // sum all values

        // Display result
        System.out.println("\nTotal Seating Capacity: " + totalCapacity);
    }
}