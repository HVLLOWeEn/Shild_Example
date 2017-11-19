package example10_io;
import java.io.*;
/**
 * Created by romansynovets on 6/4/17.
 */
public class RandomAccessDemo {
    public static void main(String[] args) {
        double[] arrData = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
        double d;

        //Открыть и использовать файл с произвольным доступом

        /*
        RandomAccessFile - класс открывающий файл с произвольным доступом
        RandomAccessFile("Имя файла", "Доступ");
            **** Доступы *****
        * "r" - read
        * "W" - write
        * "rw" - read/write
        */
        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")){
            //Записать значения в файл
            for (int i = 0; i < arrData.length; i++) {
                raf.writeDouble(arrData[i]);
            }

            //Прочитать отдельные значения из файла
            raf.seek(0);    // Найти первое значение типа double (позиция указываеться индексацией с 0)
                                 // Установка указателя файла
            d = raf.readDouble();
            System.out.println("Первое значение: " + d);

            raf.seek(8);        // Найти второе значение типа double
            d = raf.readDouble();
            System.out.println("Второе значение: " + d);

            raf.seek(24);
            d = raf.readDouble();
            System.out.println("Четвертое значение: " + d);

            System.out.println();

            // Прочитать значение через одно:
            for(int i = 0; i < arrData.length; i+=2) {
                raf.seek(i * 8);        //Найти i-е значение типа double
                d = raf.readDouble();
                System.out.println(d + " ");
            }

        } catch (IOException exc){
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
