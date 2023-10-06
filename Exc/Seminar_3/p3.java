package GB.Exc.Seminar_3;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        System.out.println("Введите 'Фамилия Имя Отчество Номер_Телефона' через пробел");
        System.out.println("ФИО должны быть введены латинницей");
        try (DataWriter datawriter1 = new DataWriter()) {
            String[] array1 = datawriter1.scanInfo();
            String filename = array1[0];
            String filedata = datawriter1.parseData(array1);
            datawriter1.dataToFile(filedata, filename);
        }

        catch (Exception e) {
            System.out.println("Ошибка при записи файла:" + e.getMessage());
        }
    }
}

class DataWriter implements AutoCloseable {
    private int telephone;

    public DataWriter() {
        this.telephone = telephone;
    }

    public String[] scanInfo() throws WrongAmountData {
        Scanner sc = new Scanner(System.in);
        String inputData = sc.nextLine();
        String[] data = inputData.split(" ");
        sc.close();
        if (data.length != 4) {
            throw new WrongAmountData(" Введено меньше или больше данных, чем требуется");
        }
        return data;
    }

    public String parseData(String[] data) throws WrongFormat {

        if (!data[0].matches("^[a-zA-Z]*$")) {
            throw new WrongFormat(" Фамилия введена неверно, используйте латинский алфавит");
        }
        if (!data[1].matches("^[a-zA-Z]*$")) {
            throw new WrongFormat(" Имя введено неверно, используйте латинский алфавит");
        }
        if (!data[2].matches("^[a-zA-Z]*$")) {
            throw new WrongFormat(" Отчество введено неверно, используйте латинский алфавит");
        }
        try {
            telephone = Integer.parseInt(data[3]);
        } catch (Exception e) {
            throw new WrongFormat(" В телефоне должны быть только цифры");
            // TODO: переделать, меня это смущает
        }

        String text = String.format("<%s> <%s> <%s> <%s>", data[0], data[1], data[2], data[3]);
        return text;
    }

    public void dataToFile(String filedata, String filename) throws FileProblem {
        File file = new File(filename + ".txt");
        try (FileWriter writer = new FileWriter(file, true)) {
            if (file.length() != 0) {

                writer.append('\n');
            }

            writer.write(filedata);
            // запись по символам
            writer.flush();
        } catch (Exception e) {
            throw new FileProblem("Невозможно записать в файл");
        }
    }

    @Override
    public void close() throws Exception {
    }
}

class WrongAmountData extends Exception {
    public WrongAmountData(String s) {
        super(s);
    }
}

class WrongFormat extends Exception {
    public WrongFormat(String s) {
        super(s);
    }
}

class FileProblem extends Exception {
    public FileProblem(String s) {
        super(s);
    }
}
