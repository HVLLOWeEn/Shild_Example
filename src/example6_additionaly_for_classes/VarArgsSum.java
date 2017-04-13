package example6_additionaly_for_classes;

/**
 * Created by hvllowe3n on 4/10/17.
 */
public class VarArgsSum {
    static int sum(int...v){
        int sum = 0;
        System.out.println("Число всех аргументов: " + v.length);
        for(int i = 0; i < v.length; i++){
            sum += v[i];
        }
        return sum;
    }
    static void sum(double...v){
        double sum = 0;
        System.out.println("Число всех аргументов: " + v.length);
        for(int i = 0; i < v.length; i++){
            sum += v[i];
        }
        System.out.println(sum);
    }
    static void sum(boolean...v){
        System.out.println("Число всех аргументов: " + v.length);
        for(int i = 0; i < v.length; i++){
            System.out.println(v[i]);
        }
    }
    public static void main(String[] args){
        VarArgsSum.sum(12,12,324);
        VarArgsSum.sum(12.0,44.43);
        // VarArgsSum.sum();

    }
}
