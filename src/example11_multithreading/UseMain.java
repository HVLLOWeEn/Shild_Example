package example11_multithreading;

/**
 * Created by romansynovets on 6/11/17.
 */
public class UseMain {
    public static void main(String[] args) {
        Thread thrd;
        thrd = Thread.currentThread();      // Получить основной поток

        // Отобразить имя основного потока
        System.out.println("Имя основного потока: " + thrd.getName());

        // Отобразить приоритет основного потока
        System.out.println("Приоритет основного потока: " + thrd.getPriority() + "\n");

        // Установить имя и приоритет основного потока
        System.out.println("Установка имени и приоритета\n");
        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY + 3);

        // Отобразить имя НОВОГО основного потока
        System.out.println("Имя основного потока: " + thrd.getName());

        // Отобразить приоритет НОВОГО основного потока
        System.out.println("Приоритет основного потока: " + thrd.getPriority());

        /* try {
            thrd.join();
        } catch(InterruptedException exc) {         <- программа не завершиться по скольку будет
                                                       ожидать завершение основного потока
            System.out.println("Interrupted");
        } */
    }
}
