package example8_pakages_and_interfaces;

/**
 * Created by hvllowe3n on 4/16/17.
 */
public interface Series {
    int getNext();      // Возвратить следующее по порядку число
    default int[] getNextArray(int n){
        int vals[] = new int[n];
        for (int i = 0; i < n; i++) vals[i] = getNext();
        return vals;
    }
    void reser();       // Сброс
    void setStart(int x);    // Установить начальное значение
}
