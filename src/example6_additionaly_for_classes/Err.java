package example6_additionaly_for_classes;

/**
 * Created by HVLLO on 02.04.2017.
 */
public class Err {
    int number;
    String message;

    public Err(String m, int num){
        number = num;
        message = m;
    }
}
class ErrorMsg{
    String[] msg = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Не достаточно дискового пространства",
            "Выход за границы массива"
    };
    int[] howbad = {3,3,2,5};
    Err getErrorInfo(int i){
        if(i >= 0 & i < msg.length){
            return new Err(msg[i],howbad[i]);
        }
        else return new Err("Не существующий код ошибки", 0);
    }
}
class ErrorInfo{
    public static void main(String[] args){
        Err e;
        ErrorMsg errMs = new ErrorMsg();
        e = errMs.getErrorInfo(2);
        System.out.println(e.message + " уровень: " + e.number);

        e = errMs.getErrorInfo(12);
        System.out.println(e.message + " уровень: " + e.number);
    }
}
