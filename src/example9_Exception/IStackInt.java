package example9_Exception;

/**
 * Created by romansynovets on 6/2/17.
 */
public interface IStackInt {
    public void put(int num) throws StackFullException;
    public int get() throws StackEmptyException;
}
