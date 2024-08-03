package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Task_10 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();


        list.add("Sevinch");
        list.add("Olima");
        list.add("Omina");
        list.add("Halima");
        list.add("MuhammadUmar");

        list1.add("Abdulloh");
        list1.add("Jamshid");
        list1.add("Jaloliddin");
        list1.add("Jasur");
        list1.add("Abduqodir");
        list1.add("Abdulboriy");

        System.out.println(list);
        list.remove(2);
        list.add(2, list1.get(2));
        System.out.println(list);
        System.out.println();
        System.out.println(list1);


    }

}
