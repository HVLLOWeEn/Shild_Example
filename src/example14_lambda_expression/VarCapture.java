package example14_lambda_expression;

// Пример захвата локальной переменной из охватывающей
// лямбда-выражением области видимости
public class VarCapture {
    public static void main(String[] args) {
        int num = 10;       // Локальная переменная, которая может быть захвачена
        MyFunc myLambda = (n) -> {
            // Такое использование переменной num корректно
            // по-скольку ее значение не меняется
            int v = num + n;

            // Не корректно, по-скольку захваченная
            // локальная переменная в блоке лямбды
            // неявно становится final
            // num++;

            return v;
        };
        System.out.println(myLambda.func(8));
        // num = 9; ... изменить значение перемнной преведет к ошибке,
        // по-скольку она потеряет статус финальной переменной.

    }
}

class B {
    public B(String st, String st1) {
        this.s = st;
    }
    private String s;
}
