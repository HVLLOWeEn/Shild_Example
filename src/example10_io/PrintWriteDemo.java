package example10_io;
import java.io.*;
/**
 * Created by romansynovets on 6/5/17.
 */
public class PrintWriteDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true); // Создание объекта PrintWriter
                                                                      // в связке с потоком System.out
        int i = 10;
        double d = 23432.45;
        pw.println(i);
        pw.println(d);
        pw.println("Использование класса PrintWriter");

        pw.println(i + " + " + d + " = " + (i + d));
    }
}
