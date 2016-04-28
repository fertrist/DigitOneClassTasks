package app;

import java.util.HashMap;
import java.util.Map;

/**
 * Задача 5
 * Уявіть що проїжаючи крізь митницю, знаєте що, різні товари
 * оподатковуються за різними відсотками. Виведіть на екран подібне:
 * Податок на товар
 * ----------------
 * Яблуко: 5%
 * Апельсин: 10%
 * Мука: 3%
 * Підказка: printf(“%...”, item);
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
        System.out.println("         Taxes:");
        System.out.println("------------------------");
        //3 - loop
        for (Map.Entry<String, Double> item : items.entrySet()) {
            //4 - print item
            System.out.printf("%-20s%.2f %n", item.getKey() + ":", item.getValue());
        }
        System.out.println("------------------------");
        System.out.println("Bye!");

    }
}
