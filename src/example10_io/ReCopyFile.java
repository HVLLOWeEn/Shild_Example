package example10_io;
import java.io.*;
/**
 * Created by romansynovets on 6/3/17.
 */

/*
*   Возможность использования try(с_ресурсами) позволяет
*   не указывать явно закрытие файлов с помощью метода close();
*   по скольку по завершению блока try он понимает что надобность в файлах исчерпана!
*   И файлы будут закрыты автоматически (Interface AutoCloseable)
*/

public class ReCopyFile {
    public static void main(String[] args) {
        int i;

        if(args.length != 2) {
            System.out.println("Использование: ReCopyFile откуда - куда?");
            return;
        }

        try(FileInputStream fio = new FileInputStream(args[0]);     // Можно указывать несколько ресурсов через (;)
            FileOutputStream fout = new FileOutputStream(args[1])) {         // <- управление 2 - я ресурсами
            do {
                i = fio.read();
                if(i != -1) fout.write(i);
            }while(i != -1);

        } catch(IOException exc) {
            System.out.println("Ошибка ввода-вывода!" + exc);
        }
    }
}
