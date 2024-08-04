package Collections;

import java.util.ArrayList;
import java.util.List;

public class Task12 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Abdulloh");
        list.add("Hafizullo");
        list.add("Sardor");
        list.add("Abdulbosit");
        list.add("Habibullo");
        list.add("Jamshid");

        List <String> list1 = list.subList(3, list.size());
        System.out.println(list);
        System.out.println(list1);


    }
}
