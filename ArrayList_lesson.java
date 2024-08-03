package Collections;

import java.util.ArrayList;

public class ArrayList_lesson {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Balck");
        list.add("Brown");
        list.add("Green");
        list.add("White");

        for(String element : list){
            System.out.println(element);
        }
    }
}
