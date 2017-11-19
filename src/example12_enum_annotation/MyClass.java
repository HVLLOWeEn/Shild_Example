package example12_enum_annotation;

/**
 * Created by romansynovets on 6/15/17.
 */

@Deprecated             // Аннотация которая сообщает о том что класс устаревший и не рекоменуется к использованию
public class MyClass {
    private String str;

    MyClass(String str) {
        this.str = str;
    }

    @Deprecated // Аннотация которая сообщает о том что МЕТОД устаревший и не рекоменуется к использованию
    public String getStr() {
        return str;
    }
}
class AnnoDemo {
    public static void main(String[] args) {
        //MyClass myClass = new MyClass("Hello");
        //System.out.println(myClass.getStr());
    }
}
