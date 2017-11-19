package example11_multithreading;

/**
 * Created by romansynovets on 6/9/17.
 */
public class Sync {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        MyThreadMonitor mt1 = new MyThreadMonitor("Child #1", array);
        MyThreadMonitor mt2 = new MyThreadMonitor("Child #2", array);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch(InterruptedException exc) {
            System.out.println("Прерывание основного потока!");
        }
    }
}
