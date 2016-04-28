package app;

/**
 * Задача 1 - 04.03.2016.
 * Write an algorithm to settle the following question:
 * A bank account starts out with $10,000.
 * Interest is compounded monthly at 6 percent per year (0.5 percent per month).
 * Every month, $500 is withdrawn to meet college expenses.
 * After how many years is the account depleted?
 */
public class CollegeApp {

    public static void main(String[] args) {
        double sum = 10000;
        double percent = 0.005;
        double exp = 500;
        int count = 0;
        while (sum > 500) {
        sum += sum * percent - exp;
        count++;
            //System.out.println(count + ' ' + sum);
        }
        // System.out.println(count + " " + sum);
        System.out.printf("You will need %d years to deplete your account. You will have only $%.2f ($%f) on your account then.", count, sum, sum);
    }

}
