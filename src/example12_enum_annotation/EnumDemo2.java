package example12_enum_annotation;

/**
 * Created by romansynovets on 6/12/17.
 */
public class EnumDemo2 {
    public static void main(String[] args) {
        Transport tr;

        System.out.println("Константы Transport:");

        // Применение values()
        //Transport[] allTransport = Transport.values();      // получение массива констант типа Transport
        for (Transport all:
             Transport.values())            // получение значений массива без создания другого массива
            System.out.println(all);

        System.out.println();

        // применение valueOf()
        tr = Transport.valueOf("TRAIN");
        System.out.println("tr содержит: " + tr);
    }
}
