package Collections;

import java.util.ArrayList;

public class Task19 {

    public static void main(String[] args) {

        ArrayList<String> list =  new ArrayList<>();


        list.add("Abdulloh");
        list.add("Hafizullo");
        list.add("Sardor");
        list.add("Abdulbosit");
        list.add("Habibullo");
        list.add("Samandar");
        System.out.println(list);
        list.trimToSize();
        System.out.println(list);


    }
}
