package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExamples {
    public static void main(String[] args) {
        // 1. create an empty ArrayList of strings
        ArrayList<String> countries = new ArrayList<>();

        // ArrayList methods
        // 1. add(obj): add obj at the end of the list (in python list.append())
        countries.add("Canada");
        countries.add("USA");
        countries.add("China");
        countries.add("Brazil");
        countries.add("Japan");

        // 2. print the arraylist
        System.out.println(countries);

        // 3. size(): returns the number of elements in the arraylist
        System.out.println(countries.size());

        // 4. add(index, obj): add obj at the given index
        countries.add(0, "Mexico");
        System.out.println(countries);

        // 5. get(i) : get the obj at index i
        System.out.println(countries.get(1));  // if it was an array, countries[1]

        // 6. set(index, obj)
        // (in array, countries[2] = "France";)
        countries.set(2, "France");
        System.out.println(countries);

        // 7. remove(obj), remove(index)
        countries.remove("France");
        System.out.println(countries);
        countries.remove(0);
        System.out.println(countries);

        // 8. contains(obj): check if obj is in the arraylist
        System.out.println(countries.contains("Canada"));

        // 9. indexOf(obj): returns the index of obj in the arraylist, if doesn't exist -1.
        System.out.println(countries.indexOf("Brazil"));

        // 10. clear(): clears the list (empty)
        countries.clear();
        System.out.println(countries);

        List<String> list = Arrays.asList("Vancouver", "Burnaby", "Surrey", "Coquitlam", "North Vancouver");
        ArrayList<String> cities = new ArrayList<>(list);
        System.out.println(cities);

        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        for (String city : cities) {
            System.out.println(city);
        }

    }
}
