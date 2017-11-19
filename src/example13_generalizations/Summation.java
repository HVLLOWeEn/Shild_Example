package example13_generalizations;

/**
 * Created by romansynovets on 6/21/17.
 */
public class Summation {
    private int sum;
    public <T extends Number>Summation(T arg) {     // Обобщенный конструктор
        this.sum = 0;
        for(int i = 0; i < arg.intValue(); i++)
            sum += i;
    }

    public int getSum() {
        return this.sum;
    }
}
