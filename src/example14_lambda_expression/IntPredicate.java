package example14_lambda_expression;

// Демонстрация использования ссылок на статические методы

// Функциональный интерфейс для числовых предикатов,
// которые воздействуютна целочисленные значения
public interface IntPredicate {
   boolean test(int n);
}
