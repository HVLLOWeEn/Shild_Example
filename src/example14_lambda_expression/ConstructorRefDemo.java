package example14_lambda_expression;

public class ConstructorRefDemo {
    public static void main(String[] args) {
        // Создать ссылку на конструктор MyClass
        // Поскольку метод func() интерфеса MyFuncString принимает аргумент,
        // new ссылается на параметризированный конструктор MyClass, а
        // не на конструктор по-умолчанию
        MyFuncString myClassCons = MyClass2::new;

        // Создать экземпляр MyClass2 посредством ссылки на конструктор
        MyClass2 myClass2 = myClassCons.func("Тестирование");

        System.out.println("Строка str в myClass2: " + myClass2.getStr());
    }
}
