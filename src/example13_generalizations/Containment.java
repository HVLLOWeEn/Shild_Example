package example13_generalizations;

/**
 * Created by romansynovets on 6/21/17.
 */
public interface Containment <T>{
    // Метод contains проверяет, содержится ли
    // некоторый элемент в обьекте класса
    // реализующий интерфейс Containment
    boolean contains(T o);
}
