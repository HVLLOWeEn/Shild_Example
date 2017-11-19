package example11_multithreading;

/**
 * Демонстрация потоков с разными приоритетами
 */
public class Priority implements Runnable {
    int count;
    Thread thrd;

    static boolean stop = false;
    static String currentName;

    /*          Создание нового потока.
    *           Данный конструктор не запускает поток на выполнение
    */
    public Priority(String name) {
        thrd = new Thread(this, name);
        count = 0;
        this.currentName = name;
    }

    // Начать выполнение нового потока
    public void run() {
        System.out.println(thrd.getName() + " - запущен!");
        do {
            count++;

            if(currentName.compareTo(thrd.getName()) != 0){
                currentName = thrd.getName();
                System.out.println("В " + currentName);
            }
        } while(stop == false && count < 10000000);
        stop = true;
        System.out.println("Выполнене потока: " + thrd.getName() + " - завершено!");
    }
}
