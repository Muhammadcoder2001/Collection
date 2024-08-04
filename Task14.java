package Collections;

import java.util.ArrayList;
import java.util.Collections;
public class Task14 {

    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();

        list.add("Abdulloh");
        list.add("Hafizullo");
        list.add("Sardor");
        list.add("Abdulbosit");
        list.add("Habibullo");
        list.add("Samandar");

        System.out.println(list);
        Collections.swap(list, 0, 2);
        System.out.println(list);


    }
}
