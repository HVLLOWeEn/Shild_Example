package example12_enum_annotation;

/**
 * Created by romansynovets on 6/12/17.
 */
public class EnumDemo {
    public static void main(String[] args) {
        Transport tr;           // обьявление ссылки на перечисление Transport
        tr = Transport.AIRPLANE;

        // Отобразить перечислимое значение
        System.out.println("Значение tp: " + tr);
        System.out.println();

        tr = Transport.TRAIN;

        // Сравнить 2 перечислимых значений
        if(tr == Transport.TRAIN) {
            System.out.println("tp содержит TRAIN\n");
        }

        // Использовать перечисление для управления оператором switch
        switch (tr) {
            case CAR: {
                System.out.println("Авто перевозит людей");
                break;
            }
            case TRACK: {
                System.out.println("Грузовик перевозит груз");
                break;
            }
            case AIRPLANE: {
                System.out.println("Самолет летит");
                break;
            }
            case TRAIN: {
                System.out.println("Поезд движется по рельсам");
                break;
            }
            case BOAL: {
                System.out.println("Лодка плывет по воде");
                break;
            }
        }
    }
}
