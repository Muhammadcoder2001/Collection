package Collections;

import java.util.ArrayList;

public class ArrayList_removeMethod {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Xola");
        list.add("Amaki");
        list.add("Buvi");
        list.add("Ota");
        list.add("Dada");
        list.add("Ona");

        System.out.println(list);

        list.remove(2);
        System.out.println(list);

    }
}
