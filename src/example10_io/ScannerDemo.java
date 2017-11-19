package example10_io;
import java.io.*;
import java.util.*;
/**
 * Created by romansynovets on 6/8/17.
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner conin = new Scanner(System.in);                 // связываем Scanner с потоком ввода InputStream
                                                                // (с его объектом (System.in))
        if(conin.hasNextInt()) {            // проверка на чтение типа (true - если тип Int) (false - другой тип)
            int num = conin.nextInt();      // преобразование данных введенных с клав. и запись в переменную соответсвующего типа (Int)
            System.out.println("Value: " + num);
        }
        else System.out.println("Не верный тип!");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        try {
            System.out.print("Press to double: ");
            str = br.readLine();
            double number = Double.parseDouble(str);
            System.out.println("Your value: " + (number/40.2));
        } catch(IOException exc){
            System.out.println("Ошибка ввода - вывода!");
        }
    }
}
