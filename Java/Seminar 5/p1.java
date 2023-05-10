/* 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Map<String, String> x = new HashMap<>();
        String entry;
        String action;
        Scanner scanner = new Scanner(System.in);
        Boolean repeat = true;

        while (repeat) {
            System.out.print("1 - просмотреть справочник\n 2 - добавить запись\n 3 - поиск\n 4 - удалить запись\n ");
            action = scanner.nextLine();

            switch (action) {
                case "" -> repeat = false;
                case "1" -> PrintAll(x);
                case "2" -> {
                    System.out.print("Введите абонента в формате 'Фамилия Телефон': ");
                    entry = scanner.nextLine();
                    x = Add(x, entry);
                }
                case "3" -> {
                    System.out.print("Введите фамилию абонента ");
                    entry = scanner.nextLine();
                    ArrayList<String> phones = Find(x, entry);
                    System.out.printf("Телефоны абонента %s :\n", entry);
                    System.out.println(phones);
                }
                case "4" -> {
                    System.out.print("Введите фамилию абонента ");
                    entry = scanner.nextLine();
                    x = Del(x, entry);
                }
                default -> System.out.println("Некорректный ввод");
            }
        }
        scanner.close();

    }

    public static void PrintAll(Map<String, String> x) {
        for (String phone : x.keySet()) {
            System.out.printf("Фамилия %s телефон %s\n", x.get(phone), phone);
        }
    }

    public static Map<String, String> Add(Map<String, String> x, String entry) {
        String[] sub = entry.split(" ", 0);
        x.putIfAbsent(sub[1], sub[0]);
        return x;
    }

    public static Map<String, String> Del(Map<String, String> x, String surname) {
        Map<String, String> xNew = new HashMap<>();
        for (String phone : x.keySet()) {
            if (!x.get(phone).toLowerCase().equals(surname)) {
                xNew.putIfAbsent(phone, x.get(phone));
            }
        }
        return xNew;
    }

    public static ArrayList<String> Find(Map<String, String> x, String surname) {
        ArrayList<String> phones = new ArrayList<>();
        for (String phone : x.keySet()) {
            if (x.get(phone).toLowerCase().equals(surname)) {
                phones.add(phone);
            }
        }
        return phones;
    }

}
