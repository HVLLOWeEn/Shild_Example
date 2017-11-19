package example7_inheritance;

import example6_additionaly_for_classes.Err;

/**
 * Created by hvllowe3n on 4/14/17.
 */
public class ErrorMsg {
    static final int OUTERR = 0;
    static final int INERR = 1;
    static final int DISKERR = 2;
    static final int INDEXERR = 3;

    String [] msg = {
            "Ошибка вывода: ",
            "Ошибка ввода: ",
            "Отсутсвует место на диске: ",
            "Выход индекса за границы диапазона: "
    };
    String getErrorMsg(int i){
        if(i >= 0 & i < msg.length)
            return msg[i];
        else return "Не допустимый индекс!";
    }
}
class FinalID{
    public static void main(String[] args){
        ErrorMsg err = new ErrorMsg();

        System.out.println(err.getErrorMsg(3) + ErrorMsg.DISKERR);
        System.out.println(err.getErrorMsg(0) + ErrorMsg.INERR);
    }
}
