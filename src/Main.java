import java.util.ArrayList;
import java.util.List;

class Train {
    private List<String> bogies;

    public Train() {
        bogies = new ArrayList<>();
    }

    public int getBogieCount() {
        return bogies.size();
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        Train train = new Train();

        System.out.println("Train consist initialized successfully.");
        System.out.println("Current number of bogies: " + train.getBogieCount());

        System.out.println("System ready for further operations...");
    }
}
