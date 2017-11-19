package example14_lambda_expression;

public class ArrayLambdaDemo {
    public static void main(String[] args) {
        MyTransform<Double> sqrts = (n) -> {        // Лямбда-выражение, массив передается не в ввиде n[], а в n.
            for(int i = 0; i < n.length; i++)
                n[i] = Math.sqrt(n[i]);
        };
    }
}