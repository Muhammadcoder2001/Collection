package Collections;

import java.util.ArrayList;

public class Task20 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(6);

        list.add("Abdulloh");
        list.add("Hafizullo");
        list.add("Sardor");
        list.add("Abdulbosit");
        list.add("Habibullo");
        list.add("Samandar");

        list.ensureCapacity(8);
        list.add("Qobil");
        list.add("Qodir");
        System.out.println(list);
    }
}
