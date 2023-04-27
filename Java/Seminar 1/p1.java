/* 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        int triangle = 0;
        int fact = 1;

        System.out.println("Что посчитать? 1. Треугольное число 2. Факториал");
        Scanner in = new Scanner(System.in);
        int chooseNum = in.nextInt();

        if (chooseNum == 1) {
            System.out.println("Введите n: ");
            Scanner in2 = new Scanner(System.in);
            int triangle2 = in2.nextInt();

            for (int i = 1; i <= triangle2; i++) {
                triangle += i;
            }

            System.out.println(triangle);
            in2.close();
        }

        if (chooseNum == 2) {
            System.out.println("Введите n: ");
            Scanner in3 = new Scanner(System.in);
            int factorial2 = in3.nextInt();

            for (int j = 2; j <= factorial2; j++) {
                fact *= j;
            }

            System.out.println(fact);
            in3.close();
        }
        in.close();
    }
}
