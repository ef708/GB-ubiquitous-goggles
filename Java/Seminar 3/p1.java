/* 1. Реализовать алгоритм сортировки слиянием. */

import java.util.*;

public class p1 {

    public static void main(String[] args) {
        List<Integer> lst = RndLst(15);
        System.out.println("Исходный список: ");
        System.out.println(lst);

        Sort(lst);
        System.out.println("Список после сортировки: ");
        System.out.println(lst);
    }

    public static void Sort(List<Integer> array) {
        if (array.size() > 1) {
            int middle = array.size() / 2;

            List<Integer> left = new ArrayList<>();
            for (int elem : array.subList(0, middle))
                left.add(elem);

            List<Integer> right = new ArrayList<>();
            for (int elem : array.subList(middle, array.size()))
                right.add(elem);

            Sort(left);
            Sort(right);

            int n, i, j;
            n = i = j = 0;

            while (i < left.size() && j < right.size()) {
                if (left.get(i) < right.get(j))
                    array.set(n++, left.get(i++));
                else
                    array.set(n++, right.get(j++));
            }

            while (i < left.size())
                array.set(n++, left.get(i++));

            while (j < right.size())
                array.set(n++, right.get(j++));
        }
    }

    public static List<Integer> RndLst(int arrLen) {
        List<Integer> numLst = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < arrLen; i++)
            numLst.add(i, rnd.nextInt(101));
        return numLst;
    }

}
