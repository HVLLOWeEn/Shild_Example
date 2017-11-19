package example10_io;
import javax.xml.crypto.Data;
import java.io.*;
/**
 * Created by romansynovets on 6/4/17.
 */
public class RWData {
    public static void main(String[] args) {
        int i = 10;
        double d = 213424.34;
        boolean b = true;

        // Записываем ряд значений
        try(DataOutputStream dataOut =
                    new DataOutputStream(new FileOutputStream("testdata"))){
            System.out.println("Записано: " + i);
            dataOut.writeInt(i);

            System.out.println("Записано: " + d);
            dataOut.writeDouble(d);

            System.out.println("Записано: " + b);
            dataOut.writeBoolean(b);

            System.out.println("Записано: " + 123 * 35.54);
            dataOut.writeDouble(123 * 35.54);
        } catch(IOException exc) {
            System.out.println("Ошибка записи!");
        }
        System.out.println();
        // Производим чтение значений из файла
        try(DataInputStream dataIn =
                    new DataInputStream(new FileInputStream("testdata"))) {
            i = dataIn.readInt();
            System.out.println("Прочитано: " + i);

            d = dataIn.readDouble();
            System.out.println("Прочитано: " + d);

            b = dataIn.readBoolean();
            System.out.println("Прочитано: " + b);

            d = dataIn.readDouble();
            System.out.println("Прочитано: " + d);
        } catch (IOException exc){
            System.out.println("Ошибка чтения!");
        }
    }
}
