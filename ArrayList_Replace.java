package Collections;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class ArrayList_Replace {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Soliha");
        list.add("Komila");
        list.add("Javohir");
        list.add("Mirabbos");
        System.out.println(list);
        list.set(0, "Abdulloh");
        System.out.println(list);

    }

}
