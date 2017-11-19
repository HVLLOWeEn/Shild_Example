package example13_generalizations;
import static java.lang.Math.*;
/**
 * Created by romansynovets on 6/21/17.
 */

/* Пример шаблона аргумента */
public class NumericFnsTemplateArgument <T extends Number> {
    T num;
    public NumericFnsTemplateArgument(T t) {
        this.num = t;
    }

    // Вернуть обратную величину:
    public double reciprocal() {
        return 1 / num.doubleValue();
    }

    // Вернуть друбную часть:
    public double fraction() {
        return num.doubleValue() / num.intValue();
    }

    public boolean absEqual(NumericFnsTemplateArgument<?> ob) {         //  Не ограниченный шаблон
        if(abs(num.doubleValue()) == abs(ob.num.doubleValue())) return true;
        else return false;
    }
    /*
    public boolean absEqual(NumericFnsTemplateArgument<? extends Number> ob) {         //  Ограниченный шаблон
        if(abs(num.doubleValue()) == abs(ob.num.doubleValue())) return true;
        else return false;
    }*/
}
