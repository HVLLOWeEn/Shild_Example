package example14_lambda_expression;

// Блочное лямбда-выражение, предназначеное для нахождения
// найменьшего положительного делителя заданого целого числа

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc smallestF = (n) -> {        // Блок лямбда-выражения
            int result = 1;

            // Получить абсолютное начение из n
            n = n < 0 ? -n : n;
            for(int i = 2; i <= n/i; i++) {
                if((n % i) == 0) {
                    result = i;
                    break;
                }
            }
            return result;              // Блочные лямбда-выражения требуют наличя инструкции return
        };
        System.out.println("Найменьшим делителем числа 12: " + smallestF.func(12));
        System.out.println("Найменьшим делителем числа 11: " + smallestF.func(11));
    }
}
