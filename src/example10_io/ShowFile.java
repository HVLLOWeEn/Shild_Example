package example10_io;
import java.io.*;

/* Отображение текстового файла.

При вызове этой программы следует указать имя файла, содержимое которого требуется просмотреть.
Например, для вывода на экран содержимого файла TEST.TXT необходимо ввести в командной строке следующую команду:
java ShowFile TEST.TXT

*/

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;                     // FileInputStream - класс на чтение из файла

        if(args.length != 1) {
            System.out.println("Использование ShowFile имя_файла");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);         // Открыть файл

            // Читать байты пока не встретиться символ EOF
            do {
                i = fin.read();                         // чтение и помещение в переменную (i)
                if(i != -1) System.out.print((char) i);
            } while(i != -1);                           // Значение i = -1 означает конец файла!

        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода!" + exc);
        } finally {                                  // На случай аварийного завершения программы
            try {
                if(fin != null ) fin.close();                        // Закрываем файл по завершении работы,
                                                                     // (если не закрыть будет утечка памяти!)
            } catch (IOException exc) {
                System.out.println("Ошибка при закрытии файла!");
            }
        }
    }
}
