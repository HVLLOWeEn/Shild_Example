package example13_generalizations;

/**
 *                          Демонстрация базового типа
 */
public class RawDemo {
    public static void main(String[] args) {
        // Создать объект класса Gen для типа Integer
        Gen<Integer> iOb = new Gen<Integer>(88);

        // Создать объект класса Gen для типа String
        Gen<String> sOb = new Gen<String>("Test generic");

        // Создать базов  объект класса Gen и передать ему
        // значение типа Double
        Gen raw = new Gen(new Double(11.0));        // Если аргумент типа не предоставляется, создается базовый тип

        // Здесь требуется приведение типов, так как тип неизвестен
        double d = (Double)raw.getob();
        System.out.println("Значение в d: " + d);

        // Использование базового типа может привести
        // к исключениям времени выполнения. Соответствующие
        // примеры представлены ниже.
        // int i = (Integer)raw.getob();            // Ошибка времени выполнения
        // System.out.println("Значение i: " + i);

        // Это присваивание нарушает безопасность типов
        sOb = raw;      // допустимо, но потенциально неверно
        String str = (String)raw.getob();       // Ошибка времени выполнения

        raw = iOb;          // допустимо, но потенциально неверно
        double d1 = (Double)raw.getob();            // Ошибка времени выполненияT
    }
}
