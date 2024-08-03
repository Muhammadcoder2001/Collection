package Collections;

import java.util.ArrayList;

public class Collections_ArrayList {

    public static void main(String[] args) {
        // default constructor
        // biz ArrayList ni String ob'ekti uchun ishlatmoqchimiz.
        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("A");
        listOne.add("B");
        listOne.add("C");
        listOne.add("D");
        listOne.add("E");
        listOne.add("F");

        System.out.println(listOne);

        // other constructor
        ArrayList<String> listTwo = new ArrayList<>(listOne);
        listTwo.add("J");
        System.out.println(listTwo);

        // other constructor
        ArrayList<String> listThree = new ArrayList<>(30);
        System.out.println(listThree);




    }

}