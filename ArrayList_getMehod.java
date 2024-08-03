package Collections;

import java.util.ArrayList;

public class ArrayList_getMehod {

    public static void main(String[] args) {

        ArrayList<String>  list = new ArrayList<>();

        list.add("Black");
        list.add("White");
        list.add("Brown");
        list.add("Blue");

        String result = list.get(list.size() - 1);
        System.out.println(result);
        result = list.get(list.size() - 2);
        System.out.println(result);

    }
}
