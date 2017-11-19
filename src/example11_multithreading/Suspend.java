package example11_multithreading;

/**
 * Created by romansynovets on 6/11/17.
 */
public class Suspend {
    public static void main(String[] args) {
        MyThreadStoppedAndSuspended ob = new MyThreadStoppedAndSuspended("My ThreadStoppedAndSuspended");
        try {
            Thread.sleep(1000); // Позволить потоку ob начать выполняться

            ob.mysuspend();
            System.out.println("Приостановка потока");
            Thread.sleep(1000);

            ob.myresume();
            System.out.println("Возобновление потока");
            Thread.sleep(1000);

            ob.mysuspend();
            System.out.println("Приостановка потока");
            Thread.sleep(1000);

            ob.myresume();
            System.out.println("Возобновление потока");
            Thread.sleep(1000);

            ob.mysuspend();
            System.out.println("Приостановка потока");
            Thread.sleep(1000);

            ob.myresume();
            System.out.println("Возобновление потока");
            Thread.sleep(1000);

            ob.mysuspend();
            System.out.println("Остановка потока");
            ob.mystop();


        } catch(InterruptedException exc) {
            System.out.println("Прерван основной поток!");
        }

        // Ожидать завершения потока
        try {
            ob.thrd.join();
        } catch(InterruptedException exc) {
            System.out.println("Прерван основной поток!");
        }
        System.out.println("Основной поток завершен!");
    }
}
