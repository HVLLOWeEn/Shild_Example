package example9_Exception;

/**
 * Created by romansynovets on 6/2/17.
 */

public class MultiCatch {
    public static void main(String[] args) {
        int a = 88, b = 0, result = 0;
        char[] chars = {'A', 'B', 'T'};


        for(int i = 0; i < 2; i++) {
            try {
                if (i == 0)
                    result = a / b;
                else if(i == 1)
                    chars[7] = 'C';


            } catch (ArithmeticException | ArrayIndexOutOfBoundsException exc) {
                System.out.println("Перехваченное исключение: " + exc.toString());
            }
        }
    }
}
