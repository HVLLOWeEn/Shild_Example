package example10_io;
import java.io.*;
/*
*   Классы для работы с файлами символьных потоков:
*       * FileReader - класс для чтения (файлов) символьных потоков
*       * FileWriter - класс для записи (файлов) символьных потоков
*
*                   **** Предназначены для работы с кодировкой Unicode ****
*/

// Демонстрация класа FileWriter
public class KtoD {
    public static void main(String[] args) {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Признак конца ввода - строка \"Stop\"!");
        try (FileWriter fw = new FileWriter("Test.txt")) {
            do {
                System.out.print(": ");
                str = br.readLine();
                if(str.compareTo("stop") == 0) break;

                str += "\r\n";      // добавить символы перевода строки!
                fw.write(str);
            } while(str.compareTo("stop") != 0);
        } catch(IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc.toString());
        }
    }
}
