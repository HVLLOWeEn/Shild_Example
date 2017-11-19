package example14_lambda_expression;

// Демонстрация использования ссылок на статические методы

// Данный класс определяет 3 статических метода,
// которые воздействуют на целочисленные значения
public class MyIntPredicates {
    static boolean isPrime(int n) {
        // Возвращет true если значение простое
        if(n < 2) return false;
        for(int i = 2; i < n / i; i++) {
            if((n % i) == 0 ) return false;
        }
        return true;
    }

    static boolean isEven(int n) {
        // Возвращает true если значение четное
        return (n % 2) == 0;
    }
    static boolean isPositive(int n) {
        // Возвращает true если значение положительное в знаке
        return (n > 0);
    }
}
