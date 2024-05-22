public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");

        for (int i = 0; i < 10; i++) {
            System.out.print(i + 1 + " ");
        }

        System.out.println("\nTask 2");

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\nTask 3");

        for (int i = 0; i <= 17; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\nTask 4");

        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\nTask 5");

        for (int i = 1904; i <= 2096; i++) {
            if (i > 1584 && (i % 4) == 0 && (i % 100 != 0 || i % 400 == 0)) {
                System.out.println(i + " год является високосным");
            }
        }

        System.out.println("Task 6");

        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }

        System.out.println("\nTask 7");

        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }

        System.out.println("\nTask 8");

        int sumOfSavings = 0;

        for (int i = 0; i < 12; i++) {
            sumOfSavings += 29000;
            System.out.println("Месяц " + (i + 1) + ", сумма накоплений равна " + sumOfSavings + " рублей");
        }

        System.out.println("Task 9");

        double sumOfSavingsBank = 0;

        for (int i = 0; i < 12; i++) {
            sumOfSavingsBank += 29000;
            sumOfSavingsBank *= 1.01;
            System.out.println("Месяц " + (i + 1) + ", сумма накоплений равна " + sumOfSavingsBank + " рублей");
        }

        System.out.println("Task 10");

        for (int i = 0; i < 10; i++) {
            System.out.println("2*" + (i + 1) + "=" + 2 * (i + 1));
        }
    }
}
