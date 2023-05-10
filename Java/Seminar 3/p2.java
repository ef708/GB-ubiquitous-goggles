/* 2. Пусть дан произвольный список целых чисел. Удалить из него чётные числа. */

import java.util.*;

public class p2 {
    public static List<Integer> RndLst(int arrLen) {
        List<Integer> numLst = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < arrLen; i++)
            numLst.add(i, rnd.nextInt(101));
        return numLst;
    }

    public static void main(String[] args) {
        List<Integer> lst = RndLst(10);
        System.out.println("Исходный список: ");
        System.out.println(lst);

        DelEven(lst);
        System.out.println("Список после удаления четных: ");
        System.out.println(lst);
    }

    public static List<Integer> DelEven(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i--);
            }
        }
        return arr;
    }
}
