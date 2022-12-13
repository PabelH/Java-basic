import java.io.Serializable;
import java.util.HashMap;

public class Client implements Serializable {
    String name;
    HashMap<String, Double> data = new HashMap<>();
    public Client() {
    }

}
