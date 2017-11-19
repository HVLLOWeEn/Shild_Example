package example11_multithreading;

/**
 * Created by romansynovets on 6/9/17.
 */
public class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Начало основного потока!");

        MyThreadManyStream mt1 = new MyThreadManyStream("Child #1");
        MyThreadManyStream mt2 = new MyThreadManyStream("Child #2");
        MyThreadManyStream mt3 = new MyThreadManyStream("Child #3");

        try {
            mt1.thrd.join();
            System.out.println("Child #1 - присоеденен");

            mt2.thrd.join();
            System.out.println("Child #2 - присоеденен");

            mt3.thrd.join();
            System.out.println("Child #3 - присоеденен");

        } catch(InterruptedException exc) {
            System.out.println("Приостановлен основной поток!");
        }
        System.out.println("Завершение основного потока!");
    }
}
