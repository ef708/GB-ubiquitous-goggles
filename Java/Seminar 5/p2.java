/* 2. Пусть дан список сотрудников:

Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов

Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class p2 {
    public static void main(String[] args) {
        String[] str = new String[] {
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        };

        ArrayList<String> names = GetName(str);
        HashMap<String, Integer> namesMap = MkMap(names);
        System.out.println("Имена после сортировки: ");
        printSortedNames(namesMap);
    }

    public static ArrayList<String> GetName(String[] list) {
        ArrayList<String> names = new ArrayList<>();

        for (String name : list) {
            String[] fullName = name.split(" ");
            names.add(fullName[0]);
        }
        return names;
    }

    public static HashMap<String, Integer> MkMap(ArrayList<String> names) {
        HashMap<String, Integer> namesMap = new HashMap<>();
        for (String name : names) {
            if (namesMap.containsKey(name)) {
                namesMap.put(name, namesMap.get(name) + 1);
            } else {
                namesMap.put(name, 1);
            }
        }
        return namesMap;
    }

    public static void printSortedNames(Map<String, Integer> map) {
        ArrayList<Integer> lst = new ArrayList<>();
        for (var item : map.entrySet()) {
            if (lst.contains(item.getValue()) == false)
                lst.add(item.getValue());
        }
        lst.sort(null);
        for (int i = lst.size() - 1; i >= 0; i--) {
            for (var item : map.entrySet()) {
                if (lst.get(i) == item.getValue())
                    System.out.printf("%s: %d;\n", item.getKey(), item.getValue());
            }
        }
    }
}
