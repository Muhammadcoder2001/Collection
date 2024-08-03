package Collections;
import java.util.ArrayList;

public class ArrayList_lesson2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Oq");
        list.add("Qora");
        list.add("Ko'k");

        list.set(0, "Oppoq");
        System.out.println(list);
    }
}
