package Collections;

import java.util.ArrayList;
import  java.util.List;
public class Task16 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();


        list.add("Abdulloh");
        list.add("Hafizullo");
        list.add("Sardor");
        list.add("Abdulbosit");
        list.add("Habibullo");
        list.add("Samandar");

        System.out.println(list);
        List <String> list1 = list.subList(0, list.size());
//        Second Path
        ArrayList<String> list2 = (ArrayList<String>)list.clone();
        System.out.println(list2);

        System.out.println(list1);


    }
}
