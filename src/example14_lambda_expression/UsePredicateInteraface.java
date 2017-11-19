package example14_lambda_expression;

import java.util.function.Predicate;

public class UsePredicateInteraface {
    public static void main(String[] args) {
        // Применение инетерфейса Predicate для определения
        // того, четно ли заданное число
        Predicate<Integer> predicate = (n) -> (n%2) == 0;        // Используется встроенный интерфес Predicate

        if(predicate.test(4)) System.out.println("4 четное");
        if(!predicate.test(5)) System.out.println("5 не четное");
    }
}
