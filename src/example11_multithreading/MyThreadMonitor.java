package example11_multithreading;

/**
 * Created by romansynovets on 6/9/17.
 */
public class MyThreadMonitor implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int a[];
    int ansver;

    // Создать новый поток
    public MyThreadMonitor(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
        thrd.start();
    }
    // Начать новый поток
    public void run() {
        int sum;

        System.out.println(thrd.getName() + " - запуск");
        synchronized (sa) {
            ansver = sa.sumArray(a);
        }

        System.out.println("Сумма для: " + thrd.getName() + ": " + ansver);
        System.out.println(thrd.getName() + " - завершение!");

    }
}


