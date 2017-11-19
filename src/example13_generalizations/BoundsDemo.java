package example13_generalizations;

/**
 * Created by romansynovets on 6/21/17.
 */

// Демонстрация класса NumericFns
public class BoundsDemo {
    public static void main(String[] args) {
        NumericFns<Integer> iOb =
                new NumericFns<Integer>(5);

        System.out.println("Обратная величина iOb: " + iOb.reciprocal());
        System.out.println("Дробная величина iOb: " + iOb.fraction() + "\n");

        // Применение класса Double также допустимо:
        NumericFns<Double> iOb1 =
                new NumericFns<Double>(5.25);

        System.out.println("Обратная величина iOb1: " + iOb1.reciprocal());
        System.out.println("Дробная величина iOb1: " + iOb1.fraction());

        //String - недопустим, не является подклассом Number!

        // NumericFns<String> iOb2 =
        //                          new NumericFns<String>("Str");
    }
}
