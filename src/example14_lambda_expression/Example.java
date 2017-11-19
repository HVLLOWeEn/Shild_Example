package example14_lambda_expression;


public class Example {
    public static void main(String[] args) {
        MyValue myValue = () -> 98.6;       // Простое лямбда выражение
        System.out.println(myValue.getValue());

        MyParamValue myParamValue = (n) -> 1.0/n;       // тип n определяется из контекста (в данном случае double)
        System.out.println(myParamValue.getValue(4.0));

        MyParamThreeValue myParamThreeValue = (i, d) -> i*d;    // типы определяются не зависимо от кол-ва аргументов!
        System.out.println(myParamThreeValue.myVal(10,114.2));
    }
}
