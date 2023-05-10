/* 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. */

import java.util.LinkedList;
import java.util.Random;

public class p1 {
    public static void main(String[] args) {
        System.out.println("Исходный LinkedList: ");
        LinkedList<Integer> sourceLst= MkRndList(10);
        System.out.println(sourceLst);

        System.out.println("Перевернутый список: ");
        System.out.println(Reverse(sourceLst));
    }

    public static LinkedList<Integer> MkRndList(int len) {
        Random rnd = new Random();
        LinkedList<Integer> lst = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            lst.add(rnd.nextInt(1001));
        }
        return lst;
    }

    public static LinkedList<Integer> Reverse(LinkedList<Integer> list) {
        LinkedList<Integer> reversedLst = new LinkedList<>();

        for (int i = 0; i < list.size(); i++) {
            reversedLst.addFirst(list.get(i));
        }

        return reversedLst;
    }
}
