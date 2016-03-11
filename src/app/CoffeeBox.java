package app;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Задача 10 - 11.03.2016.
 */
public class CoffeeBox {

    enum Nominal {
        COIN25(25), COIN50(50), UAN1(100), UAN2(200), UAN5(500);

        private int value;

        private Nominal(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Put your hryvnas:");
        int money = scan.nextInt();
        System.out.println("Put your meloches:");
        byte coins = scan.nextByte();

        int sum = money*100+coins;

        Nominal[] nominals = Nominal.values();

        Map<Nominal, Integer> map = new HashMap<>();
        for (int i = nominals.length - 1; i >= 0; i--) {
            Nominal nominal = nominals[i];
            int count = sum / nominal.getValue();
            if (count > 0 ) {
                map.put(nominal, count);
            }
            sum = sum % nominal.getValue();
        }

        for (Nominal nominal : map.keySet()) {
            System.out.printf("%.2f : %d \n",
                (double)nominal.getValue()/100, map.get(nominal));
        }
    }

}
