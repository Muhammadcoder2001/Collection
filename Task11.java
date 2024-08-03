package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Task11 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Sevinch");
        list.add("Olima");
        list.add("Omina");
        list.add("Halima");
        list.add("MuhammadUmar");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

    }
}
