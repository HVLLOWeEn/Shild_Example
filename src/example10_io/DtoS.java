package example10_io;
import java.io.*;

/**
 * Created by romansynovets on 6/5/17.
 */
public class DtoS {
    public static void main(String[] args) {
        String s;
        // Создать и использовать объект FileReader, помещенный
        // в оболочку на основе класса BufferedReader
        try(BufferedReader br = new BufferedReader(new FileReader("Test.txt"))) {
            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch(IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
