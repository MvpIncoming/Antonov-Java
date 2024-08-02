import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double division = b != 0 ? (double) a / b : Double.NaN;
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        if (b != 0) {
            System.out.println("Частное: " + division);
        } else {
            System.out.println("Частное: Деление на ноль невозможно");
        }
        scanner.close();
    }
}
