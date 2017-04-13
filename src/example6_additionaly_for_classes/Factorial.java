package example6_additionaly_for_classes;

/**
 * Created by HVLLO on 04.04.2017.
 */
class Factorial {
    int fact(int num){
        int result;

        if(num == 1) return 1;
        result = fact(num - 1) * num;
        System.out.println(result);
        return result;
    }
    int factLoop(int num){
        if(num <= 0 | num < 1) return 1;
        int result = 1;

        for (int i = 1; i < num - 1; i++) {
            result *= i;
        }
        return result;
    }
}

class Main{
    public static void main(String[] args){
        Factorial f = new Factorial();
        System.out.println("Факториал числа 5: " + f.fact(5));

    }
}