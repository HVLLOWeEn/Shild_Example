package example11_multithreading;

/**
 * Created by romansynovets on 6/11/17.
 */
public class MyThreadTickTock implements Runnable{
    Thread thrd;
    TickTock ttOb;

    //  Создание нового потока
    public MyThreadTickTock(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
        thrd.start();
    }

    // Начать выполнение нового потока
    public void run() {
        if(thrd.getName().compareTo("Tick") == 0) {
            for(int i = 0; i < 5; i++) ttOb.tick(true);
            ttOb.tick(false);
        }
        else {
            for(int i = 0; i < 5; i++) ttOb.tock(true);
            ttOb.tock(false);
        }
    }
}
