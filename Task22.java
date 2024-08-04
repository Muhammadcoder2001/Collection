package Collections;

import java.util.ArrayList;

public class Task22 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(4);

        list.add("Qobil");
        list.add("Alijon");
        list.add("Javohir");
        list.add("Abdumalik");
        list.add("Mirabbos");

        list.forEach(element-> {
            System.out.println(element);

        });
        System.out.println();
        for (int i = 0; i < list.size() - 1; i++){
            System.out.println(list.get(i));
        }


    }
}
