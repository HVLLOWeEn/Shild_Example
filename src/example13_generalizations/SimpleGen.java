package example13_generalizations;

/**
 * Created by romansynovets on 6/21/17.
 */
public class SimpleGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> iOb;
        iOb = new TwoGen<Integer, String>(88, "Generic test");      // Передача 2 - аргументов <Integer, String>

        // Автоматическое определение
        // аргументов типов компилятором
        // TwoGen<Integer, String> iOb2 = new TwoGen<>(12, "Hello");        // компилятор сам определит типы,
                                                                            // и по этому их можно повторно не указывать (JDK 7)


        iOb.showTypes();

        System.out.println("Значение: " + iOb.getob1());
        System.out.println("Значение: " + iOb.getOb2());

    }
}
