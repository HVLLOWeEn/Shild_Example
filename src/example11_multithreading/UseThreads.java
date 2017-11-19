package example11_multithreading;

/**
 * Created by romansynovets on 6/8/17.
 */
public class UseThreads {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока: ");

        // Сначала создать обьект типа MyThread
        MyThread mtObj = new MyThread("Child #1");

        // Затем сформировать поток на основе этого объекта
        Thread newThrd = new Thread(mtObj);

        // Начать выполнение потока
        newThrd.start();            // запуск потока на выполнение
        for(int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch(InterruptedException exc) {
                System.out.println("Прерывание основного потока!");
            }
        }
        System.out.println("Завершение основного потока!");
    }
}
