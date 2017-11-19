package example9_Exception;

/**
 * Created by hvllowe3n on 5/3/17.
 */
public class ThrowDemo {
    // Генерирование исключения вручную
    public static void main(String[] args){
        try {
            System.out.println("До оператора throw.");
            throw new ArithmeticException();     // генерация исключения
            // Оператор throw генерирует исключение в виде обьекта, по этому необходимо добавить new
        }
        catch (ArithmeticException exc) {
            // перехват исключения
            System.out.println("Исключение перехвачено");
        }
        System.out.println("После блока try/catch");
    }
}
