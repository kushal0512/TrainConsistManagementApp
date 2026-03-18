import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // HashMap for Bogie → Capacity Mapping
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // INSERT (Key–Value Mapping)
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 40);

        // ITERATE & DISPLAY
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            String bogie = entry.getKey();
            int capacity = entry.getValue();

            System.out.println(bogie + " -> Capacity: " + capacity);
        }

        System.out.println("\nSystem ready for further operations...");
    }
}