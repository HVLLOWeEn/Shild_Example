package example13_generalizations;

/**
 * Created by romansynovets on 6/21/17.
 */
public class MyClass <T> implements Containment<T>{     // любой класс реализ. обобщенный интерфейс также должен быть обобщенным
    T[] arrayRef;
    public MyClass(T[] arrayRef) {
        this.arrayRef = arrayRef;

    }
    public boolean contains(T o) {
        for (T x: arrayRef)
            if(x.equals(o)) return true;
            return false;
    }
}
