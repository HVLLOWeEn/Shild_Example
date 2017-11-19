package example9_Exception;

import example8_pakages_and_interfaces.*;

/**
 * Created by romansynovets on 6/2/17.
 */

class FixedQueue implements ICharQ1 {
    private char[] q;
    private int putloc;
    private int getloc;

    public FixedQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    @Override
    public void put(char ch)
            throws QueueFullException {
        if (putloc == q.length - 1){
            throw new QueueFullException(q.length - 1);
        }
        putloc++;
        q[putloc] = ch;
    }

    @Override
    public char get()
        throws QueueEmptyException {
        if (putloc == getloc) {
            throw new QueueEmptyException();

        }
        getloc++;
        return q[getloc];
    }

    @Override
    public void reset() {
        putloc = getloc = 0;
    }
}

class QExcDemo {
    public static void main(String[] args) {
        FixedQueue obj = new FixedQueue(10);
        char ch;

        try {
            for (int i = 0; i < 11; i++) {
                System.out.print("Попытка сохранить: " +
                        (char) ('A' + i));
                obj.put((char)('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();

        } catch (QueueFullException exc){
            System.out.println(exc.toString());
        }
        try {
            for (int i = 0; i < 11; i++) {
              System.out.print("Попытка получить: " );
              ch = obj.get();
                System.out.println(ch);
            }
        } catch (QueueEmptyException exc){
            System.out.println(exc.toString());
        }
    }
}
