package example10_io;
import java.io.*;

// Чтение символьных строк с консоли с использованием
// класса BufferedReader
public class ReadLines {
    public static void main(String[] args)
            throws IOException {
        String str;
        // Создать обьект типа BufferedReader
        // связанного с потоком System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите текстовые строки: ");
        System.out.println("Признак конца ввода - строка \"stop\"");

        do{
            str = br.readLine();            // Чтение текстовой строки с помощью метода readLine(); класса BufferedReader
            System.out.println(str + ", ");
        } while(!str.equals("stop"));
    }
}
