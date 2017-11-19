package example11_multithreading;

/**
 * Created by romansynovets on 6/9/17.
 */
public class UseThreadsImproved {
    public static void main(String[] args) {
        System.out.println("Начало основного потока: ");
        MyThreadNew mt1 = new MyThreadNew("Child #1");

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
