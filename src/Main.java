import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть номер завдання від 1 до 4 (або 0 для виходу):");

        while (true) {
            System.out.print("Ваш вибір: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Поглинаємо перехід на новий рядок

            switch (choice) {
                case 1:
                    System.out.println("Завдання 1 Выконано в Word))...");
                    break;
                case 2:
                    tabulateFunction();
                    break;
                case 3:
                    calculateRealSum();
                    break;
                case 4:
                    findShortestString();
                    break;
                case 0:
                    System.out.println("Вихід з програми...");
                    return;
                default:
                    System.out.println("Невідоме завдання. Будь ласка, введіть число від 1 до 4, або 0 для виходу.");
                    break;
            }
        }
    }

    public static void tabulateFunction() {
        for (double x = -2.0; x <= 2.0; x += 0.2) {
            double y = Math.pow(x, 2);  // Припустимо, що це x^2
            System.out.printf("f(%.1f) = %.2f\n", x, y);
        }
    }

    public static void calculateRealSum() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        System.out.println("Введіть 10 дійсних чисел:");
        for (int i = 0; i < 10; i++) {
            double number = scanner.nextDouble();
            sum += number;  // Сумуємо дійсні числа
        }
        System.out.println("Сума дійсних частин: " + sum);
    }

    public static void findShortestString() {
        Scanner scanner = new Scanner(System.in);
        String shortest = null;

        System.out.println("Вводьте рядки. Для завершення введіть 'done':");
        while (true) {
            String input = scanner.nextLine();
            if ("done".equals(input)) {
                break;
            }
            if (shortest == null || input.length() < shortest.length()) {
                shortest = input;
            }
        }

        System.out.println("Найкоротший рядок: " + (shortest != null ? shortest : ""));
    }
}
