package example8_pakages_and_interfaces;

/**
 * Created by hvllowe3n on 5/1/17.
 */
// Переопределение лишь метода без реализации
public class MyIFImp implements MyIF {
    @Override
    public int getUserID() {
        return 100;
    }
}
// Переопределение всех методов (включая метод-по умолчанию)
// в данном случае мы возвращаем значение 42 в место по умолчанию 1.
class MyIFImp2 implements MyIF {
    @Override
    public int getUserID() {
        return 100;
    }
    @Override
    public int getAdminID() {
        return 42;
    }
}

class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        System.out.println("Идентификатор пользователя: "
                + obj.getUserID());

        System.out.println("Идентификотор администратора: "
                + obj.getAdminID());


        MyIFImp2 obj1 = new MyIFImp2();
        System.out.println("Идентификатор пользователя: "
                + obj1.getUserID());

        System.out.println("Идентификотор администратора: "
                + obj1.getAdminID());

        int uID = MyIF.getUniversalID();
        System.out.println("Вызов статического метода интерфейса: " + uID);

    }
}

