package example12_enum_annotation;

/**
 * Created by romansynovets on 6/12/17.
 */
public class EnumDemo3 {
    public static void main(String...args) {
        Transport tp;

        // Отобразить скорость самолета
        System.out.println("Типичная скорость для самолета: "
                + Transport.AIRPLANE.getSpeed() + " миль в час\n");

        // Отобразить все виды транспорта и скорости их движения
        System.out.println("Типичные скорости движения транспортных средств: ");
        for (Transport trans:
             Transport.values()) {
            System.out.println(trans + ": "
                    + trans.getSpeed()
                        + " миль в час");
        }

        System.out.println(Transport.BOAL.ordinal());       // .ordinal - возвр. порядковый номер константы
    }
}
