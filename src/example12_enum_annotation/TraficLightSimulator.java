package example12_enum_annotation;


// Автоматизированное управление светофором
public class TraficLightSimulator implements Runnable {
    private Thread thrd;                         // поток для управление светофором
    private TraficLightColor traficLightColor;   // текущий цвет
    boolean stop = false;                        // для остановки иммитации установить true
    boolean change = false;                      // true если светофор переключился

    public TraficLightSimulator(TraficLightColor traficLightColor) {
        this.traficLightColor = traficLightColor;

        thrd = new Thread(this);
        thrd.start();
    }

    public TraficLightSimulator() {
        traficLightColor = TraficLightColor.RED;

        thrd = new Thread(this);
        thrd.start();
    }

    public void run() {
        while(!stop) {
            try {
                switch (traficLightColor) {
                    case GREEN: {
                        Thread.sleep(10000);        // зеленый на десять секунд
                        break;
                    }
                    case YELLOW: {
                        Thread.sleep(2000);         // желтый 2 секунды
                        break;
                    }
                    case RED: {
                        Thread.sleep(12000);        // красный 12 секунд
                    }
                }
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }

    // Переключение цвета
    public synchronized void changeColor() {
        switch(traficLightColor) {
            case RED:
                traficLightColor = TraficLightColor.GREEN;
                break;
            case YELLOW:
                traficLightColor = TraficLightColor.RED;
                break;
            case GREEN:
                traficLightColor = TraficLightColor.YELLOW;
        }
        change = true;
        notify();           // Уведомить ожидающие потоки
    }

    // Ожидание переключения светофора
    public synchronized void waitForChange() {
        try {
            while(!change) wait();      // Ожидать переключения светофора
            change = false;
        } catch(InterruptedException exc) {
            System.out.println(exc);
        }
    }

    // Возврат текущего цвета
    public TraficLightColor getTraficLightColor() {
        return traficLightColor;
    }

    // Прекращение имитации светофора
    public void  cancel() {
        stop = true;
    }
}
