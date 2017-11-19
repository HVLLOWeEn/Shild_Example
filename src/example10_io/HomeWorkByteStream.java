package example10_io;
import java.io.*;
/**
 * Created by romansynovets on 6/8/17.
 */
public class HomeWorkByteStream {
    public static void main(String[] args) {
        int value;
        FileInputStream fio = null;
        FileOutputStream fout = null;

        if(args.length != 2) {
            System.out.println("Использование: HomeWorkByteStream откуда - куда");
            return;
        }

        try {
            fio = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                value = fio.read();
                if(value != -1) {
                    if(value == 32) {
                        value = 45;
                        fout.write(value);
                    }
                    else fout.write(value);
                }
            } while(value != -1);

        } catch(IOException exc) {
            System.out.println("Ошибка ввода-вывод: " + exc.toString());
        }
        finally {
                try {
                    if (fio != null) fio.close();
                } catch (IOException exc) {
                    System.out.println("Ошибка при закрытии входного файла: " + exc.toString());
                }

                 try {
                    if (fout != null) fout.close();
                } catch (IOException exc) {
                     System.out.println("Ошибка при закрытии выходного файла: " + exc.toString());
                }
        }
    }
}
