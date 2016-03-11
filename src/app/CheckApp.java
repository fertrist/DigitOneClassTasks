package app;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Задача 5
 */
public class CheckApp {
    public static void main(String[] args) {
        //1 - initialization
        Map<String, Double> items = new HashMap<>();
        items.put("Apples", 0.15);
        items.put("Peaches", 0.10);
        items.put("Bananas", 0.20);
        items.put("Oranges", 0.40);

        //2 - header
        System.out.println("Taxes:");
        System.out.println("------------------------");
        //3 - loop
        Set<String> keys = items.keySet();
        for (String key : keys) {
            //4 - print item
            double tax = items.get(key);
            System.out.printf("%-10s:%10.2f %n", key, tax);
        }
        System.out.println("------------------------");
        System.out.println("Bye!");

    }
}
