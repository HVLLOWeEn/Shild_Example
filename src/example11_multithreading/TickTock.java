package example11_multithreading;

/**
 * Created by romansynovets on 6/10/17.
 */

// ипользование wait() и notify()
public class TickTock {
    String state;           // состояние часов

    synchronized void tick(boolean running) {
        if(!running) {      // Остановить часы
            state = "ticked";
            notify();       // уведомить ожидающие потоки
            return;
        }
        System.out.print("Tick ");
        state = "ticked";   // установить текущее состояние после такта "Tick "
        notify();           // позволить выполняться методу tock()  -> уведомить ожидающие потоки
        try {
            Thread.sleep(500);
        } catch(InterruptedException exc){
            System.out.println("Прерывание потока!");
        }
        try {
            while(!state.equals("tocked")) {
                wait(); // ожидать до завершения tock();
            }
        } catch (InterruptedException exc) {
            System.out.println("Прерывание потока!");
        }
    }

    synchronized void tock(boolean running) {
        if(!running) {
            state = "tocked";   // установить текущее состояние после такта "Tock "
            notify();           // позволить выполняться методу tick()  -> уведомить ожидающие потоки
            return;
        }
        System.out.println("Tock");
        state = "tocked";
        notify();
        try {
            Thread.sleep(500);
        } catch(InterruptedException exc){
            System.out.println("Прерывание потока!");
        }
        try {
            while(!state.equals("ticked")) {
                wait();     // ожидать до завершения tick();
            }
        } catch(InterruptedException exc) {
            System.out.println("Прерывание потока!");
        }
    }
}
