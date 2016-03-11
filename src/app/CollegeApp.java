package app;

/**
 * Задача 1 - 04.03.2016.
 */
public class CollegeApp {

    public static void main(String[] args) {
        double sum = 10000;
        double percent = 0.005;
        double exp = 500;
        int count = 0;
        while (sum > 500) {
        sum = sum+sum*percent - exp;
        count++;
            //System.out.println(count + ' ' + sum);
        }
        System.out.println(count + " " + sum);
    }

}
