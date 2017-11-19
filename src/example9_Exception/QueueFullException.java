package example9_Exception;

/**
 * Created by romansynovets on 6/2/17.
 */
public class QueueFullException extends Exception {
    private int size;

    public QueueFullException(int size) {
        this.size = size;
    }
    public String toString() {
        return "\nОчередь заполнена. Максимальный размер очереди: "
                + size;
    }
}
