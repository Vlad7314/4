import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // 1. Лямбда-выражение для интерфейса Printable
        Printable printer = () -> System.out.println("Hello, Lambda!");
        printer.print();

        // 2. Проверки строки с помощью Predicate
        Predicate<String> isNotNull = s -> s != null;
        Predicate<String> isNotEmpty = s -> !s.isEmpty();

        // Объединение условий через and()
        Predicate<String> validString = isNotNull.and(isNotEmpty);

        // Тестирование
        String test1 = null;
        String test2 = "";
        String test3 = "Hello";

        System.out.println("Test 1 (null): " + validString.test(test1)); // false
        System.out.println("Test 2 (empty): " + validString.test(test2)); // false
        System.out.println("Test 3 (valid): " + validString.test(test3)); // true
    }
}

// Интерфейс Printable
interface Printable {
    void print();
}