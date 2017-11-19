package example13_generalizations;

/**
 * Created by romansynovets on 6/21/17.
 */
public class WildcardDemo {
    public static void main(String[] args) {
        NumericFnsTemplateArgument<Integer> iOb
                = new NumericFnsTemplateArgument<Integer>(6);

        NumericFnsTemplateArgument<Double> iOb1
                = new NumericFnsTemplateArgument<Double>(-6.0);

        if(iOb.absEqual(iOb1)) System.out.println("Совпадают!");
        else System.out.println("Не совпадают!");
    }
}
