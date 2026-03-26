import java.util.*;
import java.util.stream.Collectors;

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

        System.out.println("=== UC9 - Group Bogies using Streams ===");

        // Reusing list (similar to UC7 & UC8)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 60));

        // Display original list
        System.out.println("\nOriginal Bogies:");
        bogies.forEach(System.out::println);

        // 🔥 GROUPING LOGIC
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // Display grouped result
        System.out.println("\nGrouped Bogies:");

        for (String key : groupedBogies.keySet()) {
            System.out.println("\nType: " + key);
            for (Bogie b : groupedBogies.get(key)) {
                System.out.println("  " + b);
            }
        }
    }
}