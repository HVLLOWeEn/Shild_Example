package example14_lambda_expression;

/**
 * Created by romansynovets on 6/27/17.
 */
public class LambdaDemo {
    public static void main(String[] args) {
        MyValue myValue;            //  ссылка интерфейсного типа

        // Здесь лямбда-выражение - это просто константа
        // При его назначении переменной myValue создается
        // экземпляр класса, в котором лямбда-выражение
        // реализует метод getValue() интерфейса MyValue.
        myValue = () -> 98.6;

        // Вызвать метод getValue(), предоставляемый ранее
        // назначенным лямбда-выражением
        System.out.println("Постоянное значение: " + myValue.getValue());


        // Создать параметризированное лямбда-выражение и назначить его
        // ссылке на экземпляр MyParamValue. Это лямбда-выражение
        // возвращает обратную величину своего аргумента
        MyParamValue myParamValue = (n) -> 1.0 / n;

        // Вызвать метод getValue(n) посредством ссылки myParamValue
        System.out.println("Обратная величина 4 равна: " + myParamValue.getValue(4.0));
        System.out.println("Обратная величина 8 равна: " + myParamValue.getValue(8.0));

        // Лямбда-выражение должно быть совместным с методом,
        // определенным в ф-льном интерфейсе.
        // приведенные ниже 2 фрагмента кода не будут работать

        // myValue = () -> "Three"; // Ошибка! Тип String не совместим с типом double
        // myParamValue = () -> Math.random();  // Ошибка! Требуется параметр.
    }
}
