package example9_Exception;

/**
 * Created by hvllowe3n on 5/3/17.
 */
public class ExcDemo5 {
    // Вложенные операторы try
    public static void main(String[] args){
        int number[] = { 4,8,16,32,64,128,256,512};
        int denom[] = { 2,0,4,4,0,8};

        try {
            for(int i = 0; i < number.length; i++){
                try {
                    System.out.println(number[i] + " / " + denom[i] + " = "
                            + number[i] / denom[i]);
                }
                catch(ArithmeticException exc) {
                    System.out.println("Поптыка деления на нуль!");
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Соответсвующий элемент не найден...");
            System.out.println("Фатальная ошибка - выполнение программы прервано.");
        }
    }
}
