package com.seminar_6;

import java.util.List;

public class Main {
    public static double avg(List<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Список пустой");
        }

        double sum = 0;

        for (int i : list) {
            sum += i;
        }

        return sum / list.size();
    }

    public static String maxAvg(List<Integer> firstList, List<Integer> secondList) {
        if (firstList.isEmpty() || secondList.isEmpty()) {
            throw new IllegalArgumentException("Имеются пустые списки");
        }

        double firstAvg = avg(firstList);
        double secondAvg = avg(secondList);

        if (firstAvg > secondAvg) {
            return "Первый список имеет большее среднее значение";
        } else if (secondAvg > firstAvg) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }

}