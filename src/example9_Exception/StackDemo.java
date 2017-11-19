package example9_Exception;

/**
 * Created by romansynovets on 6/2/17.
 */
public class StackDemo implements IStackInt{
    private int[] s;
    private int putloc;
    private int getloc;

    public StackDemo(int size) {
        s = new int[size + 1];
        putloc = 0;
        getloc = s.length;
    }
    public void put(int num)
            throws StackFullException{
        if(putloc == s.length - 1){
            throw new StackFullException(s.length + 1);
        }
        putloc++;
        s[putloc] = num;
    }
    public int get()
            throws StackEmptyException{
        if(getloc <= 0) {
            throw new StackEmptyException();
        }
        getloc--;
        return s[getloc];
    }
}
