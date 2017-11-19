package example14_lambda_expression;

/**
 * Created by romansynovets on 6/27/17.
 */
public interface MyParamThreeValue {
    double myVal(int a, double b);
    String toString();      // допустимо, по-скольку использовать методы класса Object разрешено в ф-х интерфейсах

}
