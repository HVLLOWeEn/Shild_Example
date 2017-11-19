package example9_Exception;



/**
 * Created by hvllowe3n on 5/2/17.
 */
public class ExcTest {
    //Генерация исключения
    static void genException() {
        int nums[] = new int[4];

        System.out.println("До генерации исключения.");

        // Сгенерировать исключение в связи с
        // выходом индекса за границы массива
        nums[7] = 10;
        System.out.println("Эта строка не будет отображаться");
    }
}
/*class ExcDemo2 {
    public static void main(String[] args) {
        try {
            ExcTest.genException();
        }
        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Выход за границы массива!");
        }
        int a, b, result;
        try {
            a = 12;
            b = 0;
            result = a / b;
        }
        catch(ArithmeticException aExc){
            System.out.println("Попытка делить на нуль!");
        }
        System.out.println("После оператора catch");
    }
}*/
