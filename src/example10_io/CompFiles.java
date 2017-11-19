package example10_io;
import java.io.*;
/**
 * Created by romansynovets on 6/4/17.
 */
public class CompFiles {
    public static void main(String[] args) {
        int i = 0, j = 0;
        int numberPosition = 0;
        if(args.length != 2) {
            System.out.println("Использование: CompFiles файл_1, файл_2");
            return;
        }

        try (FileInputStream fin = new FileInputStream(args[0]);
             FileInputStream fin1 = new FileInputStream(args[1])){
            do {
                i = fin.read();
                j = fin1.read();
                numberPosition++;
                if(((i + 32) != j || (j - 32) != i) && ((i - 32) != j || (j + 32) != i)) {
                    System.out.println("Номер позиции отличающихся символов: " + numberPosition);
                    System.out.println("Содержимое файлов отличаеться!");
                }
                else       System.out.println("Содержимое файлов совпадает!");
            }while(i != -1 && j != -1);
        } catch(IOException exc) {
            System.out.println("Ошибка ввода-вывода!" + exc.toString());
        }
    }
}
