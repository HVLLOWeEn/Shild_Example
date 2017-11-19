package example10_io;
import java.io.*;
/**
 * Created by romansynovets on 6/8/17.
 */
public class HomeWorkCharsStream {
    public static void main(String[] args) {
        int i;

        if(args.length != 2) {
            System.out.println("Использование: HomeWorkCharsStream откуда - куда?");
            return;
        }

        try (FileReader flRead = new FileReader(args[0]);
                FileWriter flWrite = new FileWriter(args[1])) {
            do {
                i = flRead.read();
                if(i != -1) {
                    if(i == (char)' '){
                        i = (char)'-';
                        flWrite.write(i);
                    }
                    else flWrite.write(i);
                }
            } while(i != -1);
        } catch(IOException exc) {
            System.out.println("Ошибка ввода - вывода: " + exc.toString());
        }
    }
}
