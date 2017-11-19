package example9_Exception;

/**
 * Created by hvllowe3n on 5/3/17.
 */
public class ExcDemo4 {
    public static void main(String[] args) {
        // Множественные операторы catch
        int number[] = { 4,8,16,32,64,128,256,512};
        int denom[] = { 2,0,4,4,0,8};

        for(int i = 0; i < number.length; i++) {
            try {
                System.out.println(number[i] + " / " + denom[i] + " = "
                        + number[i] / denom[i]);
            }
            catch(ArrayIndexOutOfBoundsException exc) {         // оператор catch переключаеться в зависимости от перехвата
                                                                // того или инного исключения
                System.out.println("Выход за границы массива!");
            }
            catch(ArithmeticException exc){
                System.out.println("Попытка деления на нуль!");
            }
            catch(Throwable exc){                               //Суперкласс всех подклассов исключений
                                                                //Вызываеться в самом конце всех catch-ей
                                                                //поскольку он собой может заменить все подклассы.
                System.out.println("Возникло исключение!");
            }
        }
    }
}
