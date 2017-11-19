package example14_lambda_expression;

// Демонстрация использования ссылок на конструкторы
public class MyClass2 {
    private String str;

    // Этот конструктор принемает аргумент
    public MyClass2(String str) {
        this.str = str;
    }

    // Конструктор по-умолчанию
    public MyClass2() {
        this.str = str;
    }

    String getStr() { return this.str; }
}
