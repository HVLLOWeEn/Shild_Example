package example9_Exception;

/**
 * Created by romansynovets on 6/2/17.
 */
public class QueueEmptyException extends Exception {
    public String toString() {
        return "\nОчередь пуста.";
    }
}
