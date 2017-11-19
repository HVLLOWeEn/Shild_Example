package example10_io;
import java.io.*;
/**
 * Created by romansynovets on 6/5/17.
 */
public class ReadChars {
    public static void main(String[] args)
            throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       // Создание объекта BufferReader
                                                                                        // связанного с потоком System.in
        System.out.println("Введите символы, окончание ввода - символ точки (.)");

        do {
            c = (char) br.read();
            System.out.println(c);
        }while(c != '.');
    }
}
