package Collections;

import java.util.ArrayList;

public class Task17 {

    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();

        list.add("Abdulloh");
        list.add("Hafizullo");
        list.add("Sardor");
        list.add("Abdulbosit");
        list.add("Habibullo");
        list.add("Samandar");

//        Mode 1
//        list.removeAll(list);
//        System.out.println(list);
//      Mode 2
        list.clear();
        System.out.println(list);

    }
}
