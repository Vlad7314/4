import java.util.function.Predicate;
import java.util.Scanner;

public class LambdaTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> isValidString = s ->
                s != null && !s.isEmpty() &&
                        ("JN".indexOf(Character.toUpperCase(s.charAt(0))) >= 0) &&
                        Character.toUpperCase(s.charAt(s.length() - 1)) == 'A';

        System.out.println("Проверка строк");
        System.out.println("Для выхода введите 'exit'");
        System.out.println("=========================================");

        while (true) {
            System.out.print("Введите строку для проверки: ");
            String input = scanner.nextLine();

            // Выход из программы
            if ("exit".equalsIgnoreCase(input)) {
                System.out.println("Программа завершена.");
                break;
            }

            // Проверка условия
            boolean result = isValidString.test(input);
            System.out.printf("Результат проверки: %s%n", result ? "УСПЕХ" : "НЕ УДОВЛЕТВОРЯЕТ УСЛОВИЯМ");
            System.out.println("---");
        }

        scanner.close();
    }
}