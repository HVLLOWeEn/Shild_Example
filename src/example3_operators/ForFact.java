package example3_operators;

/**
 * Created by HVLLO on 22.02.2017.
 */
public class ForFact {
    public static void main(String [] args){
        int fact = 1, sum = 0;

        for (int i = 1; i <= 5; i++){
            fact *= i;
            sum += i;
        }
        System.out.println(fact);
        System.out.println(sum);

    }
}
