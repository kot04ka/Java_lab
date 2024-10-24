import java.util.Scanner;

public class InequalityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення рядка нерівності
        System.out.println("Введіть нерівність (наприклад: 1 > 2):");
        String inequality = scanner.nextLine();

        // Розділення рядка на частини
        String[] parts = inequality.split(" ");
        int num1 = Integer.parseInt(parts[0]);
        String operator = parts[1];
        int num2 = Integer.parseInt(parts[2]);

        // Перевірка нерівності
        boolean result = false;

        switch (operator) {
            case ">":
                result = num1 > num2;
                break;
            case "<":
                result = num1 < num2;
                break;
            case ">=":
                result = num1 >= num2;
                break;
            case "<=":
                result = num1 <= num2;
                break;
            case "==":
                result = num1 == num2;
                break;
            default:
                System.out.println("Невідома операція порівняння.");
                return;
        }

        // Виведення результату
        if (result) {
            System.out.println("ТАК");
        } else {
            System.out.println("НІ");
        }
    }
}
