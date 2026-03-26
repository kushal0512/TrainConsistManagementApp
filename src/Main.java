import java.util.*;
import java.util.stream.*;

public class Main {

    // Goods Bogie class
    static class GoodsBogie {
        String type;   // Cylindrical, Rectangular, Open, Box
        String cargo;  // Petroleum, Coal, Grain, etc.

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return type + " -> " + cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC12 - Safety Compliance Check ===");

        // Create goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid
        bogies.add(new GoodsBogie("Rectangular", "Coal"));      // allowed
        bogies.add(new GoodsBogie("Open", "Grain"));            // allowed
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid

        // Display bogies
        System.out.println("\nGoods Bogies:");
        bogies.forEach(System.out::println);

        // 🔥 SAFETY RULE USING allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );

        // Output result
        System.out.println("\nSafety Status:");
        if (isSafe) {
            System.out.println("Train is SAFE ✅");
        } else {
            System.out.println("Train is UNSAFE ❌");
        }
    }
}