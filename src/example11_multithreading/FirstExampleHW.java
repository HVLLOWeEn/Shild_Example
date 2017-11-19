package example11_multithreading;

/**
 * Created by romansynovets on 6/11/17.
 */
public class FirstExampleHW {
    public static void main(String[] args) {
        MyThrd_HW mt = new MyThrd_HW("Child #1 HW");
        MyThrd_HW mt1 = new MyThrd_HW("Child #2 HW");


        mt.thrd.setPriority(Thread.NORM_PRIORITY + 3);
        mt1.thrd.setPriority(Thread.MIN_PRIORITY);

        mt.thrd.start();
        mt1.thrd.start();

        try {
            mt.thrd.join();
            mt1.thrd.join();
        } catch(InterruptedException exc) {
            System.out.println("Основной поток прерван!");
        }
        System.out.println("Основной поток завершен!");
    }
}
