package Collections;

import java.util.ArrayList;

public class Task7 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Sevinch");
        list.add("Olima");
        list.add("Omina");
        list.add("Halima");
        list.add("MuhammadUmar");

        for (int i = 0; i < list.size(); i++ ){
            if(list.get(i) == "Olima"){
                System.out.println("Index is " + i + "\n" + "Name is: " +  list.get(i));
            }
        }
    }
}
