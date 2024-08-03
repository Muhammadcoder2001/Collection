package Collections;

import java.util.ArrayList;

public class Copy_array {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();

        list.add("Sevinch");
        list.add("Olima");
        list.add("Omina");
        list.add("Halima");
        list.add("MuhammadUmar");

        for (String element : list){
            list1.add(element);
        }
        System.out.println(list);
        System.out.println(list1);

    }
}
