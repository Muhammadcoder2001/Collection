package Collections;


import java.util.ArrayList;

public class Task13 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList <String> list1 = new ArrayList<>();

        list.add("Abdulloh");
        list.add("Hafizullo");
        list.add("Sardor");
        list.add("Abdulbosit");
        list.add("Habibullo");
        list.add("Samandar");

        list1.add("Abdulloh");
        list1.add("Hafizullo");
        list1.add("Sardor");
        list1.add("Abdulbosit");
        list1.add("Habibullo");
        list1.add("Jamshid");

        System.out.println(list.subList(0,2).equals(list1.subList(0,2)));



    }


}
