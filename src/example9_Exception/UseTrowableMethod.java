package example9_Exception;

/**
 * Created by hvllowe3n on 5/3/17.
 */

public class UseTrowableMethod {
    public static void main(String[] args) {
        try {
            ExcTest.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Стандартное сообщение: ");
            System.out.println(exc);
            System.out.println("\nСтек вызовов: ");
            exc.printStackTrace();      // метод записей последовательности вызовов которые привели к
                                        // возникновению исключения
        }
        System.out.println("После оператора catch");
    }
}
