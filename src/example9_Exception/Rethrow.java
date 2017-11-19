package example9_Exception;

import javax.swing.text.TableView;

/**
 * Created by hvllowe3n on 5/3/17.
 */
public class Rethrow {
    public static void getException() {
        int number[] = { 4,8,16,32,64,128,256,512};
        int denom[] = { 2,0,4,4,0,8};

        for (int i = 0; i < number.length; i++) {
            try {
                System.out.println(number[i] + " / " + denom[i]
                        + " = " + number[i] / denom[i]);
            }
            catch(ArithmeticException exc) {
                System.out.println("Попытка деления на нуль.");
            }
            catch (ArrayIndexOutOfBoundsException exc){
                // Перехватить исключение
                System.out.println("Соответсвующий элемент не найден.");
                throw exc;      //повторно сгенерировать исключение
            }
        }
    }
}

class RethrowDemo {
    public static void main(String[] args) {
        Throwable exc = new Throwable();
        try {
           Rethrow.getException();
        }
        catch(Throwable exc1) {
            System.out.println("Fatal error- "
                    + "program ex execution aborted");

        }

    }
}
