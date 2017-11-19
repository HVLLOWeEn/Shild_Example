package example13_generalizations;

/**
 * Created by romansynovets on 6/17/17.
 */

//  ***** Обобщения (параметризированные классы) *****   //


public class Gen<T> {       // В обьявлении этого класса T означает обобщенный тип
    T ob;       // обьявить обьект типа T

    // Передать конструктору ссылку на обьект типа T
    public Gen(T ob) {
        this.ob = ob;
    }

    // Вернуть обьект (оb) из метода
    T getob() {
        return this.ob;
    }

    // Отобразить тип T
    void showType () {
        System.out.println("Тип T - это: " + ob.getClass().getName());
    }
}
