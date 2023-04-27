/* 3. Реализовать простой калькулятор
 */

import java.util.Scanner;

public class p3 {
    public static double Sum(double num1, double num2) {
        return num1 + num2;
    }

    public static double Subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double Mult(double num1, double num2) {
        return num1 * num2;
    }

    public static double Division(double num1, double num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;

        System.out.print("Введите первое число: ");
        num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        num2 = scanner.nextDouble();

        System.out.print("Что нужно сделать? (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result;
        if (operation == '+') {
            result = Sum(num1, num2);
            System.out.printf("%.2f %c %.2f = %.2f\n", num1, operation, num2, result);
        }
        if (operation == '-') {
            result = Subtraction(num1, num2);
            System.out.printf("%.2f %c %.2f = %.2f\n", num1, operation, num2, result);
        }
        if (operation == '*') {
            result = Mult(num1, num2);
            System.out.printf("%.2f %c %.2f = %.2f\n", num1, operation, num2, result);
        }
        if (operation == '/') {
            result = Division(num1, num2);
            System.out.printf("%.2f %c %.2f = %.2f\n", num1, operation, num2, result);
        }
        scanner.close();
    }
}