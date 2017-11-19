package example9_Exception;

/**
 * Created by romansynovets on 6/2/17.
 */
public class StackFullException extends Exception {
    private int size;
    public StackFullException(int size) {
        this.size = size;
    }
    public String toString() {
        return " Stack overflow!";
    }
}
