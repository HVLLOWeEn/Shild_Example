package example10_io;
import java.io.*;

public class RandomAccessDemoInteger {
    public static void main(String[] args) {
        int num;
        int arrInt[] = {324,436,547,435,57};

        try(RandomAccessFile rafInt =
                    new RandomAccessFile("randomIntDoc.rfs", "rw")) {
            for(int i = 0; i < arrInt.length; i++) {
                rafInt.writeInt(arrInt[i]);
            }

            for(int i = 0; i < arrInt.length; i++) {
                rafInt.seek(i * 4);
                num = rafInt.readInt();
                System.out.println(num + " ");
            }
        } catch(IOException exc){
            System.out.println("Ошибка ввода-вывода: " + exc.toString());
        }
    }
}
