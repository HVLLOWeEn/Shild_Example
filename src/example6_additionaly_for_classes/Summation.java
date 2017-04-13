package example6_additionaly_for_classes;

/**
 * Created by HVLLO on 02.04.2017.
 */
public class Summation {
    int sum;

    Summation(int num){
        sum = 0;
        for(int i = 1; i <= num; i++)
            sum += i;
    }
    Summation(Summation ob){
        sum = ob.sum;
    }
}
class SumDemo{
    public static void main(String[] args){
        Summation ob = new Summation(5);
        Summation ob1 = new Summation(ob);

        System.out.println(ob.sum);
        System.out.println(ob.sum);
    }
}