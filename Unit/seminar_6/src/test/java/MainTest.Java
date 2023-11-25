package org.seminar_6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MainTest {

    @org.junit.jupiter.api.Test
    void avg() {
        List<Integer> list = new ArrayList<>(List.of(3, 6, 12));
        double result = Main.avg(list);
        assertEquals(7, result);

    }

    @org.junit.jupiter.api.Test
    void maxAvg() {
        List<Integer> listOne = new ArrayList<>(List.of(6, 6, 6));
        List<Integer> listTwo = new ArrayList<>(List.of(2, 2, 2));

        String expected = "Первый список имеет большее среднее значение";
        String actual = Main.maxAvg(listOne, listTwo);
        assertEquals(expected, actual);

        listTwo.add(18);
        expected = "Средние значения равны";
        actual = Main.maxAvg(listOne, listTwo);
        assertEquals(expected, actual);

        listTwo.add(18);
        expected = "Второй список имеет большее среднее значение";
        actual = Main.maxAvg(listOne, listTwo);
        assertEquals(expected, actual);
    }

    @Test
    public void ListsAreEmptyInMaxAvg() {
        List<Integer> emptyList1 = new ArrayList<>();
        List<Integer> emptyList2 = new ArrayList<>();

        assertThrows(IllegalArgumentException.class,
                () -> Main.maxAvg(emptyList1, emptyList2));
    }

    @Test
    public void ListIsEmptyInAvg() {
        List<Integer> input = new ArrayList<>();

        assertThrows(IllegalArgumentException.class, () -> {
            Main.avg(input);
        });
    }


}