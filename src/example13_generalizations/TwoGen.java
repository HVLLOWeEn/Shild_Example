package example13_generalizations;

/**
 * Created by romansynovets on 6/21/17.
 */
public class TwoGen <T, V> {            //Задаю несколько аргументов
    T ob1;
    V ob2;

    public TwoGen(T o1, V o2) {
        this.ob1 = o1;
        this.ob2 = o2;
    }

    public void showTypes() {
        System.out.println("Тип T: " + ob1.getClass().getName());
        System.out.println("Тип V: " + ob2.getClass().getName());
    }

    public T getob1() {
        return ob1;
    }
    public V getOb2() {
        return ob2;
    }
}
