package example13_generalizations;

/**
 * Created by romansynovets on 6/21/17.
 */
public class GenConsDemo {
    public static void main(String[] args) {
        Summation ob = new Summation(4.0);

        System.out.println("Сумма целых чисел от 0 до 4.0 равна: " + ob.getSum());
    }
}
