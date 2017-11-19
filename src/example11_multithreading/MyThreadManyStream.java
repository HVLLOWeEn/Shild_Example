package example11_multithreading;

/**
 * Created by romansynovets on 6/9/17.
 */
public class MyThreadManyStream implements Runnable {
    Thread thrd;

    public MyThreadManyStream(String name) {
        thrd = new Thread(this,name);
        thrd.start();       // Начать поток
    }
    public void run() {
        System.out.println("В: " + thrd.getName() + " - запуск");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("В: " + thrd.getName() + ", счетчик: " + i);
            }
        } catch(InterruptedException exc) {
            System.out.println(thrd.getName() +" - прерван");
        }
        System.out.println(thrd. getName() + " - завершение");
    }
}
