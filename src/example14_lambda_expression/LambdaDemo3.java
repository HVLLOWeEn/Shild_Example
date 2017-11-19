package example14_lambda_expression;

/**
 * Created by romansynovets on 6/28/17.
 */
public class LambdaDemo3 {
    public static void main(String[] args) {
        // Данное лямбда-выражение определяет,
        // является ли одна строка частью другой
        StringTest isIn = (a, b) -> a.indexOf(b) != -1;

        String str = "Это тест";
        System.out.println("Тестируемая строка: " + str);

        if(isIn.test(str, "Это"))
            System.out.println("'Это' - найдено!");
        if(isIn.test(str, "xyz"))
            System.out.println("'xyz' найдено!");
        else
            System.out.println("'xyz' не найдено!");
    }
}
