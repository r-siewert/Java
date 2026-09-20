import java.util.ArrayList;
import java.util.List;

public class sundaypracc {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("paper");
        items.add(1, "pen");
        items.add(2, "pencil");
        items.add(3, "erasers");
        items.add("paper");
        for (String x : items) {
            System.out.println(x + " ");
        }

    }
}
