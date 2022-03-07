package week2.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            al.add((int) (Math.random() * 50) + 1);
        }
        System.out.println("ArrayList: " + al);
        Scanner in = new Scanner(System.in);
        System.out.print("Value to find: ");
        int toFind = in.nextInt();
        int index = al.lastIndexOf(toFind);
        if (index != -1) {
            System.out.println("\n" + toFind + " is in slot " + index);
        } else {
            System.out.println("\n" + toFind + " is not in the ArrayList.");
        }
        in.close();
    }
}
