package example14_lambda_expression;

public class GenericFunctionlInterfaceDemo {
    public static void main(String[] args) {

        // Данное лямба-выражение определяет, является ли одно
        // целое число делителем другого
        SomeTest<Integer> isFactor = (n, m) -> (n % m) == 0;

        if(isFactor.test(10,2))
            System.out.println("2 является делителем числа 10");
        System.out.println();


        // Данное лямба-выражение определяет, является ли одно
        // число Double делителем другого
        SomeTest<Double> isFactorD = (n, m) -> (n % m) == 0;

        if(isFactorD.test(212.0, 4.0))
            System.out.println("212.0 является делителем числа 4.0");
        System.out.println();


        // Данное лямба-выражение определяет, является ли одна
        // строка частью другой
        SomeTest<String> isIn = (n, m) -> n.indexOf(m) != -1;
        String str = "Обобщенный функциональный интерфейс";

        System.out.println("Тестируемая строка: " + str);

        if(isIn.test(str, "фейс"))
            System.out.println("'фейс' найдено!");
        else
            System.out.println("'фейс' не найдено!");


    }
}
