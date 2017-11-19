package example8_pakages_and_interfaces;

/**
 * Created by hvllowe3n on 5/1/17.
 */
public interface MyIF {
    public static final int MIN = 0;
    public int getUserID();
    public default int getAdminID() {        // Реализация метода по-умолчания в интерфейсе
        return 1;                            // для реализации необходимо ключевое
                                             // слово "default"
    }
    static int getUniversalID(){
        return 0;
    }
}
