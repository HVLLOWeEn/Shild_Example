package example10_io;
import java.io.*;
/**
 * Created by romansynovets on 6/5/17.
 */
public class AvgNums {
    public static void main(String[]args) {
        // Создать объект типа BufferedReader,
        // использующий поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;
        double sum = 0.0;
        double avg, t;
        System.out.print("Сколько чисел вы введете?: ");

        try {
            str = br.readLine();
            n = Integer.parseInt(str);                  // Преобразование строки в числовое значение типа int
        } catch(NumberFormatException | IOException exc) {
            System.out.println("Не верный формат!");
            n = 0;
        }
        System.out.println("Ввод " + n + " значений");
        for(int i = 0; i < n; i++) {
            System.out.print(": ");
            try {
                str = br.readLine();
                t = Double.parseDouble(str);            // Преобразование строки в числовое значение типа double
            } catch(NumberFormatException | IOException exc){
                System.out.println("Неверный формат!");
                t = 0.0;
            }
            sum += t;
        }
        avg = sum / n;
        System.out.println("Среднее значение: " + avg);
    }
}
