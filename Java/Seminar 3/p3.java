/* 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка. */

import java.util.*;

public class p3 {
    
    public static List<Integer> RndLst(int arrLen) {
        List<Integer> numLst = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < arrLen; i++)
            numLst.add(i, rnd.nextInt(101));
        return numLst;
    }

    public static void main(String[] args) {
        int arrrLen = 15;
        List<Integer> lst = RndLst(arrrLen);
        System.out.println("Исходный список: ");
        System.out.println(lst);

        int min = lst.get(0);
        int max = lst.get(0);
        int sum = lst.get(0);

        for (int i : lst.subList(1, arrrLen)) {
            sum += i;
            if (min > i) min = i;
            if (max < i) max = i;
        }
        
        System.out.printf("Минимальное число: %d\n", min);
        System.out.printf("Максимальное число: %d\n", max);
        System.out.printf("Cреднее арифметичское: %.1f\n", (double)sum / arrrLen);
    }    
}
