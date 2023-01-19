import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Juan");
        names.add("Maria");
        names.add("Pedro");
        names.add("Ana");
        names.sort(List.DESCENDING);
        System.out.println(names);
    }
}