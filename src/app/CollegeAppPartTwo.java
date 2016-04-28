package app;

/**
 * Задача 1.1
 * Write a program that prints the balance of an account after the first,
 * second, and third year.
 * The account has an initial balance of $1,000
 * and earns 5 percent interest per year.
 */
public class CollegeAppPartTwo {
    public static void main(String[] args) {
        int initialBalance = 1000;      // Первоначальный балланс
        float interestRate = 0.05f;     // Процентная ставка (годовых)
        String[] wordsOfNumbers = new String[] {"first", "second", "third"};

        // Для подсчета мы будем использовать переменную newBalance.
        // Поэтому кладем в нее наш первоначальный балланс.
        float newBalance = initialBalance;

        // Если начисление процентов производится 1 раз в год в конце года
        System.out.println("If you will have calculation once per year at the end of the year.");
        for (int i = 0; i < 3; i++) {
            newBalance += newBalance * interestRate;
            System.out.printf("At the end of the %s year your account balance will be $%,.2f.%n", wordsOfNumbers[i], newBalance);
        }

        // Если начисление процентов производится ежемесячно
        newBalance = initialBalance;    // начинаем с начала, с первоначального балланса
        System.out.println("\nIf you will have calculation once per month.");
        for (int i = 0; i < 3 * 12; i++) {
            newBalance += newBalance * interestRate / 12;
            if ((i + 1) % 12 == 0) {    // если конец года (12й, 24й или 36й месяц (не забываем про нумерацию с нуля))
                System.out.printf("At the end of the %s year your account balance will be $%,.2f.%n", wordsOfNumbers[i / 12], newBalance);
            }
        }
    }
}
