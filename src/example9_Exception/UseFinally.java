package example9_Exception;

/**
 * Created by hvllowe3n on 5/3/17.
 */
public class UseFinally {
    public static void genExeption(int what) {
        int t;
        int []nums = new int[2];

        System.out.println("Получено: " + what);
        try {
            switch(what) {
                case 0: {
                    t = 10 / what;      //генерация ошибки деления на нуль
                    break;
                }
                case 1: {
                    nums[4] = 4;        //генерация ошибки обращения к массиву
                    break;
                }
                case 2: {
                    return;
                }
            }
        }
        catch (ArithmeticException exc){
            System.out.println(exc.toString());
        }
        catch (ArrayIndexOutOfBoundsException exc){
            System.out.println(exc.toString());
        }
        finally {               // Вызывается не зависимо от того как завершается блок try/catch
            System.out.println("Выйти из блока try");

        }
    }
}
class FinallyDemo {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++) {
            UseFinally.genExeption(i);
            System.out.println();
        }
    }
}
