package example11_multithreading;

/**
 * Created by romansynovets on 6/8/17.
 */
public class MyThread implements Runnable{
    private String thrdName;

    public MyThread(String thrdName) {
        this.thrdName = thrdName;
    }

    // Точка входа в поток
    public void run() {         // Отсюда начинаю выполняться потоки
        System.out.println(thrdName + " - запуск");
        try {
            for(int count = 0; count < 10; count++) {
                Thread.sleep(400);      // Приостанавливает исполнение потока на указанное число милли секунд
                System.out.println("B " + thrdName
                        + ", счетчик: " + count);
            }
        } catch(InterruptedException exc) {
            System.out.println(thrdName + " - прерван!");
        }
        System.out.println(thrdName + " - Завершение!");
    }
}
