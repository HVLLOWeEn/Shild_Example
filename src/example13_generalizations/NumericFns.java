package example13_generalizations;

/**
 * Created by romansynovets on 6/21/17.
 */

// Демонстрация ограниченного типа:
public class NumericFns <T extends Number> {    // Обьявление которое сообщает компилятору, что аругументом
                                                // типа T должен быть либо Number, либо подкласс Number
    T num;
    public NumericFns(T num) {
        this.num = num;
    }

    // Вернуть обратную величину:
    public double reciprocal() {
        return 1 / num.doubleValue();
    }

    // Вернуть друбную часть:
    public double fraction() {
        return num.doubleValue() / num.intValue();
    }
}
