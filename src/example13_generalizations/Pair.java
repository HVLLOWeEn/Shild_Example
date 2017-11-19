package example13_generalizations;

/**
 * Created by romansynovets on 6/21/17.
 */
public class Pair <T, V extends T>{
    T first;
    V second;

    public Pair(T a, V b) {
        this.first = a;
        this.second = b;
    }
}
