package example11_multithreading;

import java.util.TreeMap;

/**
 * Created by romansynovets on 6/9/17.
 */
public class MoreThreads {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока:");

        MyThreadManyStream mt1 = new MyThreadManyStream("Child #1");
        MyThreadManyStream mt2 = new MyThreadManyStream("Child #2");
        MyThreadManyStream mt3 = new MyThreadManyStream("Child #3");

        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока!");
            }
        }while(mt1.thrd.isAlive() || mt2.thrd.isAlive() || mt3.thrd.isAlive());     // isAlive() return true если поток выполняеться
                                                                                    // false если поток завершен!
        System.out.println("Завершение основного потока!");
    }
}
