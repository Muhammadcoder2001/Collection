package Collections;

import java.util.ArrayList;
import java.util.Collections;
public class Task21 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(5);

        list.add("Qobil");
        list.add("Alijon");
        list.add("Javohir");
        list.add("Abdumalik");
        list.add("Mirabbos");

        Collections.replaceAll(list, "Alijon", "Muhammad");
        System.out.println(list);

    }
}
