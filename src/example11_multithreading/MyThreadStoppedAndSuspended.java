package example11_multithreading;

/**
 * Created by romansynovets on 6/11/17.
 */
public class MyThreadStoppedAndSuspended implements Runnable{
    Thread thrd;
    volatile boolean suspended;     // Приостанавливает поток при значении true
    volatile boolean stopped;       // Останавливает поток при значении true

    public MyThreadStoppedAndSuspended(String name) {
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
        thrd.start();       // начать новый поток
    }
    // Точка входа в поток
    public void run() {
        System.out.println(thrd.getName() + " - запуск");
        try {
            for(int i = 1; i < 1000; i++) {
                System.out.print(i + " ");
                if((i%10) == 0) {
                    System.out.println();
                    thrd.sleep(250);
                }

                synchronized (this) {        // используеться для тестирование переменных suspended, stopped;
                    while(suspended) {
                        wait();
                    }
                    if(stopped) break;
                }
            }
        } catch(InterruptedException exc) {
            System.out.println(thrd.getName() + " - прерван.");
        }
        System.out.println(thrd.getName() + " - завершен.");
    }

    // остановить поток
    synchronized void mystop() {
        stopped = true;

        // Следующие операторы обеспечивают полную
        // остановку приостановленного потока
        suspended = false;
        notify();
    }

    // Приостановить поток
    synchronized void mysuspend() {
        suspended = true;
    }

    // Возобновить поток
    synchronized void myresume() {
        suspended = false;
        notify();
    }
}
