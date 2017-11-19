package example11_multithreading;

/**
 * Created by romansynovets on 6/9/17.
 */
public class MyThreadNew extends Thread {
    //private Thread thrd;        // в этой переменной храниться ссылка на поток

    public MyThreadNew(String name) {
        super(name);       // имя присвоиваеться потоку при его создании
        start();           // начало выполнения потока
    }

    // Начать выполнение нового потока
    public void run() {
        System.out.println(getName() + " - запуск");
        try {
            for(int i = 0; i < 9; i++) {
                Thread.sleep(400);
                System.out.println("В: " + getName() + " ,счетчик: " + i);
            }
        } catch(InterruptedException exc) {
            System.out.println(getName() + " - прерван!");
        }
        System.out.println(getName() + " - завершение!");
    }
}
