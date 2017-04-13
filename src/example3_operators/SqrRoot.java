package example3_operators;

/**
 * Created by HVLLO on 22.02.2017.
 */
public class SqrRoot {
    public static void main(String[] args){
        double sroot, rerr;
        for(double i = 1.0;i < 100.0; i++){
            sroot = Math.sqrt(i);
            System.out.println("Корень квадратный из " + i + " = " + sroot);

            rerr = i - Math.pow(sroot, 2);
            System.out.println("Ошибка округления: " + rerr);
        }
    }
}
