package example10_io;
import java.io.*;
/* Копирование текстового файла.

При вызове этой програ  следует указать имена исходного
и целевого файлов. Например, для копирования файла FIRST.TXT в файл SECOND.TXT в командной строке н но ввести следующую команду:
    java CopyFile FIRST.TXT SECOND.TXT
*/

public class CopyFile {
    public static void main(String[] args)
        throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        if(args.length != 2) {
            System.out.println("Использование CopyFile: откуда - куда?");
            return;
        }

        //              **** Копирование файла ****
        try {
            // Попытка открытия файлов
            fin = new FileInputStream(args[0]);     // Обьект для чтения из файла
            fout = new FileOutputStream(args[1]);   // Обьект для запись в файл

            do {
                i = fin.read();             // Чтение из файла (в байтах) и помещение в (i)
                if (i != -1) fout.write(i); // Запись в файл
            }while(i != -1);
        } catch(IOException exc) {
            System.out.println("Ошибка ввода вывода: " + exc);
        } finally {
            try {
                if (fin != null) fin.close();
            } catch(IOException exc) {
                System.out.println("Ошибка при закрытии входного файла!");
            }

            try {
                if(fout != null) fout.close();
            } catch(IOException exc) {
                System.out.println("Ошибка при закрытии выходного файла!");
            }
        }
    }
}
