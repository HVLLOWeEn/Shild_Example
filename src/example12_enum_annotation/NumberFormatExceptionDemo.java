package example12_enum_annotation;

/**
 * Created by romansynovets on 6/15/17.
 */
public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        Double d;
        try {
            d = new Double("5");
        } catch(NumberFormatException exc) {
            System.out.println(exc);
        }
    }
}
