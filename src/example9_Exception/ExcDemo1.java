package example9_Exception;

/**
 * Created by hvllowe3n on 5/2/17.
 */
public class ExcDemo1 {
    public static void main(String[] args) {
        int []nums = new int[4];
        try {           // try блок контроля!
            System.out.println("До генерации исключения...");
            nums[0] = 10;
        }
        catch (ArrayIndexOutOfBoundsException exc) { // catch - перехватывает исключение.
            System.out.println("Выход за границы массива!");
        }
        System.out.println("После выполнения оператора catch...");
    }
}
