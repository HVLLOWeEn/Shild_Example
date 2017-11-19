package example12_enum_annotation;

/**
 * Created by romansynovets on 6/14/17.
 */
public class EnumDemo4 {
    public static void main(String[] args) {
        Transport tp, tp1, tp2;

        System.out.println("Получить порядковые номера с помощью метода .ordinal(): ");
        for (Transport transport:
             Transport.values()) {
            System.out.println(transport.ordinal());
        }

        System.out.println();

        // Использование метода compareTo();
        tp = Transport.AIRPLANE;
        tp1 = Transport.TRAIN;
        tp2 = Transport.AIRPLANE;

        if(tp.compareTo(tp1) < 0) {         // сравнение порядковых значений
            System.out.println(tp + " идет перед: " + tp1);
        }
        if(tp.compareTo(tp1) > 0) {
            System.out.println(tp1 + " идет перед:" + tp);
        }
        if(tp.compareTo(tp2) == 0) {
            System.out.println(tp + " совпадает с: " + tp2);
        }
    }
}
