/* 1. В файле содержится строка с исходными данными в такой форме:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class p1 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("GB\\Java\\Seminar 2\\file.txt"));
            final String SELECT = "SELECT * FROM students WHERE ";
            String line;
            String result;
            StringBuilder builder = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                line = line.substring(1, line.length() - 2);
                line = line.replace("\"", "");
                String[] string = line.split(", ");
                for (String i : string) {
                    String[] iArr = i.split(":");
                    if (!iArr[1].equals("null")) {
                        builder.append(String.format("%s = \"%s\" AND ", iArr[0], iArr[1]));
                    }
                }
                result = builder.toString();
                builder.setLength(0);
                result = SELECT + result.substring(0, result.length() - 5) + ';';
                System.out.println(result);
            }
            reader.close();
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}