package collections.list;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        MyArrayList<String> al = new MyArrayList<>();
        al.add("Hello");
        System.out.println(al);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Hello");
        System.out.println(al2);

    }
}
