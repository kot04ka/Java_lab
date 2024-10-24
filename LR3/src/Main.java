import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Завдання 1: Виведення трьох емоджі
        System.out.println("\uD83D\uDE00"); // 😀
        System.out.println("\uD83D\uDE02"); // 😂
        System.out.println("\uD83D\uDC4D"); // 👍

        // Завдання 2: Видалення першої та останньої літери з рядка
        String input = "Programming";
        String result = input.substring(1, input.length() - 1);
        System.out.println(result);
    }
}


