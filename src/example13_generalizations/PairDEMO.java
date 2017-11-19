package example13_generalizations;

/**
 * Created by romansynovets on 6/21/17.
 */
public class PairDEMO {
    public static void main(String[] args) {
        /* Допустимо */
        Pair<Number, Integer> iOb =
                new Pair<Number, Integer>(1234, 11);

        /* Допустимо */
        Pair<Number, Number> iOb1 =
                new Pair<Number, Number>(111,232);

        /* Недопустимо */
        //Pair<Number, String>...
    }
}
