package example10_io;
import java.io.*;
/*
    В этой версии программы ShowFile оператор try с ресурсами применяется
    для автоматического закрытия файла, когда в нем
    больше нет необходимости.
*/

public class ReShowFile {
    public static void main(String[] args) {
        int i;
        if(args.length != 1) {
            System.out.println("Использование: ReShowFile имя_файла!");
            return;
        }

        try(FileInputStream fin = new FileInputStream(args[0])){            // try с ресурсами
            do{
                i = fin.read();
                if(i != -1) System.out.println((char) i);
            }while(i != -1);
        } catch(IOException exc) {
            System.out.println("Ошибка ввода-вывода!" + exc);
        }
    }
}
