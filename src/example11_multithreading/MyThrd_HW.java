package example11_multithreading;

/**
 * Created by romansynovets on 6/11/17.
 */
public class MyThrd_HW implements Runnable{
    Thread thrd;

    public MyThrd_HW(String name) {
        thrd = new Thread(this, name);

    }

    public void run() {
        try {
            for(int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("В: " + thrd.getName() + ", счетчик: " + i);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " - прерван!");
        }
        System.out.println(thrd.getName() + " - завершен!");
    }
}
